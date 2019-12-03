package com.eheinen.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class TokenDecoder {

    public Claims decode(String token) {
        SigningKeyFactory signingKeyFactory = new SigningKeyFactory();

        return Jwts.parser()
            .setSigningKey(signingKeyFactory.create())
            .parseClaimsJws(token).getBody();
    }
}
