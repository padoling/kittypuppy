package com.padoling.kittypuppy.api.user.model;

import com.padoling.kittypuppy.api.user.domain.SocialType;
import com.padoling.kittypuppy.api.user.domain.UserType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserVO {

    private Long id;
    private SocialType socialType;
    private String socialUid;
    private UserType userType;
    private String nickname;
    private String email;
    private String refreshToken;

    @Builder
    public UserVO(Long id, SocialType socialType, String socialUid, UserType userType, String nickname, String email, String refreshToken) {
        this.id = id;
        this.socialType = socialType;
        this.socialUid = socialUid;
        this.userType = userType;
        this.nickname = nickname;
        this.email = email;
        this.refreshToken = refreshToken;
    }
}
