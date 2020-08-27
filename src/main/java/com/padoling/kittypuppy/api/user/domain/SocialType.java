package com.padoling.kittypuppy.api.user.domain;

import lombok.Getter;

@Getter
public enum SocialType {

    K("KAKAO"),
    G("GOOGLE"),
    N("NAVER");

    private final String name;

    SocialType(String name) {
        this.name = name;
    }
}
