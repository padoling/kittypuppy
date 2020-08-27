package com.padoling.kittypuppy.api.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    private String socialUid;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private String nickname;

    private String email;

    private String refreshToken;

    @Builder
    public User(Long id, SocialType socialType, String socialUid, UserType userType, String nickname, String email, String refreshToken) {
        this.id = id;
        this.socialType = socialType;
        this.socialUid = socialUid;
        this.userType = userType;
        this.nickname = nickname;
        this.email = email;
        this.refreshToken = refreshToken;
    }
}
