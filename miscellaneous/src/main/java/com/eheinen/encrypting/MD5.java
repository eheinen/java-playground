package com.eheinen.encrypting;

import org.apache.commons.codec.digest.DigestUtils;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    private static final String MD5_ALGORITHM = "MD5";

    public String javaSecurityHash(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(MD5_ALGORITHM);

        messageDigest.update(password.getBytes());
        byte[] passwordHashBytes = messageDigest.digest();

        return DatatypeConverter.printHexBinary(passwordHashBytes).toUpperCase();
    }

    public String apacheCommonsHash(String password) {
        return DigestUtils.md5Hex(password).toUpperCase();
    }
}
