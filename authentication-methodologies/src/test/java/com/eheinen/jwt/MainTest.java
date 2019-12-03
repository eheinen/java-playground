package com.eheinen.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.SignatureException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    private static final String INVALID_TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJJRCIsInN1YiI6IntcIm5hbWVcIjpcIkVkdWFyZG8gSGVpbmVuXCIsXCJhZG1pblwiOnRydWUsXCJpZFwiOlwiMTIzXCJ9IiwiaXNzIjoiRYXJkbyIsImlhdCI6MTU3MzcxMTA0MywiZXhwIjoxNTczNzExMDkzfQ.-OnwTVElWUxj1Wi8DrExl51BYay43CSzw0lt7mjA";

    private static final String TOKEN_CLAIM_ID = "ID";
    private static final String TOKEN_CLAIM_ISSUER = "Eduardo";
    private static final String TOKEN_CLAIM_SUBJECT = "person";

    private static final String TOKEN_JSON_ID_KEY = "id";
    private static final String TOKEN_JSON_NAME_KEY = "name";
    private static final String TOKEN_JSON_ADMIN_KEY = "admin";

    private static final String PERSON_ID = "123";
    private static final String PERSON_NAME = "Eduardo Heinen";

    private Person buildPerson() {
        Person person = new Person();
        person.setId(PERSON_ID);
        person.setName(PERSON_NAME);

        return person;
    }

    @ParameterizedTest
    @CsvSource({
        "true",
        "false"
    })
    public void should_return_token_with_admin_as_true_and_false(boolean isAdmin) {
        Person person = buildPerson();
        person.setAdmin(isAdmin);

        TokenGeneratorFactory tokenGeneratorFactory = new TokenGeneratorFactory();
        String actualToken = tokenGeneratorFactory.create(TOKEN_CLAIM_SUBJECT,
            new JSONObject(person).toString(), TOKEN_CLAIM_ISSUER, TOKEN_CLAIM_ID);

        TokenDecoder tokenDecoder = new TokenDecoder();
        Claims tokenClaim = tokenDecoder.decode(actualToken);

        assertEquals(tokenClaim.getId(), TOKEN_CLAIM_ID);
        assertEquals(tokenClaim.getIssuer(), TOKEN_CLAIM_ISSUER);

        JSONObject tokenSubjectJSON = new JSONObject(tokenClaim.get(TOKEN_CLAIM_SUBJECT).toString());
        assertEquals(tokenSubjectJSON.get(TOKEN_JSON_ID_KEY), PERSON_ID);
        assertEquals(tokenSubjectJSON.get(TOKEN_JSON_NAME_KEY), PERSON_NAME);
        assertEquals(tokenSubjectJSON.get(TOKEN_JSON_ADMIN_KEY).toString(), String.valueOf(isAdmin));
    }

    @Test
    public void should_not_decode_an_invalid_token() {
        TokenDecoder tokenDecoder = new TokenDecoder();
        assertThrows(SignatureException.class, () -> tokenDecoder.decode(INVALID_TOKEN));
    }
}
