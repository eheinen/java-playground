package com.eheinen.jwt;

import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;

public class SigningKeyFactory {

    private static final String SECRET_KEY = "I am a valid TOKEN!!!";

    private final SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

    public Key create() {
        byte[] secretBase64Binary = DatatypeConverter.parseBase64Binary(SECRET_KEY);
        return new SecretKeySpec(secretBase64Binary, signatureAlgorithm.getJcaName());
    }
}
