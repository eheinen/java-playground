package com.eheinen.encrypting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MD5Test {

    private static final String PASSWORD = "ILoveJava";
    private static final String EXPECTED_HASH = "35454B055CC325EA1AF2126E27707052";

    private MD5 md5;

    @BeforeEach
    public void beforeEach() {
        md5 = new MD5();
    }

    @Test
    public void should_hash_password_successfully() throws NoSuchAlgorithmException {
        String javaSecurityHash = md5.javaSecurityHash(PASSWORD);
        assertEquals(EXPECTED_HASH, javaSecurityHash);

        String apacheCommonsHash = md5.apacheCommonsHash(PASSWORD);
        assertEquals(EXPECTED_HASH, apacheCommonsHash);
    }
}
