package com.padoling.kittypuppy.api.session.controller;

import com.padoling.kittypuppy.api.user.service.UserService;
import com.padoling.kittypuppy.model.user.SignInRequestDto;
import com.padoling.kittypuppy.model.user.SignInResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class sessionController {

    private final UserService userService;

    @PostMapping("/signIn")
    public ResponseEntity signIn(SignInRequestDto signInRequestDto) {
        String token = userService.createToken(signInRequestDto);
        return ResponseEntity.ok().body(new SignInResponseDto());
    }
}
