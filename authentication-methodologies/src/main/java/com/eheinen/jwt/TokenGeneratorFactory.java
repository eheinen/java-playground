package com.eheinen.jwt;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class TokenGeneratorFactory {

    private static final long TTL_IN_MS = 50000;

    private final SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

    public String create(final String claimKey, final String claimJson, final String issuer, final String id) {
        SigningKeyFactory signingKeyFactory = new SigningKeyFactory();

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        JwtBuilder jwtBuilder = Jwts.builder()
            .setId(id)
            .claim(claimKey, claimJson)
            .setIssuer(issuer)
            .setIssuedAt(now)
            .signWith(signatureAlgorithm, signingKeyFactory.create());

        long expireMillis = nowMillis + TTL_IN_MS;
        Date expireDate = new Date(expireMillis);

        jwtBuilder.setExpiration(expireDate);

        return jwtBuilder.compact();
    }
}
