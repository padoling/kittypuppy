package com.padoling.kittypuppy.common.util;

public interface JwtUtil {
    String createToken();
    void verifyToken(String givenToken);
}
