package com.padoling.kittypuppy.api.user.controller;

import com.padoling.kittypuppy.api.user.model.UserVO;
import com.padoling.kittypuppy.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity addUser(@RequestBody UserVO userRequest) {
        Map<String, Long> response = new HashMap<>();
        response.put("userId", userService.addUser(userRequest));
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

}
