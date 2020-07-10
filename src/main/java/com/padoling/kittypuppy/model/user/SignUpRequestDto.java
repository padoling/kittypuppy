package com.padoling.kittypuppy.model.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignUpRequestDto {

    private String email;
    private String password;
    private String userName;

    @Builder
    public SignUpRequestDto(String email, String password, String userName) {
        this.email = email;
        this.password = password;
        this.userName = userName;
    }
}
