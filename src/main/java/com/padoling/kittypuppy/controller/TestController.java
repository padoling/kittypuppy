package com.padoling.kittypuppy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @Value("${profile}")
    private String profile;

    @Value("${core}")
    private String core;

    @GetMapping("/test")
    public String testIndex() {
        return "Profile : " + this.profile + " & Core : " + this.core;
    }
}
