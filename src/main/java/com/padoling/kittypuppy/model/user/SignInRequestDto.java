package com.padoling.kittypuppy.model.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignInRequestDto {
    private String email;
    private String password;

    @Builder
    public SignInRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
