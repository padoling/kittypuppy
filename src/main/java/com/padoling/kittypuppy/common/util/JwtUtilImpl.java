package com.padoling.kittypuppy.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class JwtUtilImpl implements JwtUtil {
    private String secretKey;
    private long expireLength;

    public JwtUtilImpl(
            @Value("${security.jwt.token.secret-key}") String secretKey,
            @Value("${security.jwt.token.expire-length}") int expireLength
    ) {
        this.secretKey = secretKey;
        this.expireLength = expireLength;
    }

    @Override
    public String createToken() {
        Claims claims = Jwts.claims();

        Date now = new Date();
        Date expiration = new Date(now.getTime() + expireLength);
        SecretKey key = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(now)
                .setExpiration(expiration)
                .signWith(key)
                .compact();
    }

    @Override
    public void verifyToken(String givenToken) {

    }
}
