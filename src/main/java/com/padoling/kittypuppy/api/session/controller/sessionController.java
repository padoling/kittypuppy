package com.padoling.kittypuppy.api.session.controller;

import com.padoling.kittypuppy.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class sessionController {

    private final UserService userService;
}
