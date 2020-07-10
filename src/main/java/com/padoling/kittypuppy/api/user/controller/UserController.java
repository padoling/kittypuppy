package com.padoling.kittypuppy.api.user.controller;

import com.padoling.kittypuppy.api.user.service.UserService;
import com.padoling.kittypuppy.model.user.SignUpRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/signUp")
    public Long signUp(SignUpRequestDto signUpRequestDto) {
        return userService.saveUser(signUpRequestDto);
    }
}
