package com.padoling.kittypuppy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${profile}")
    private String profile;

    @GetMapping
    public Map<String, String> testIndex() {
        Map<String, String> map = new HashMap<>();
        map.put("profile", profile);
        return map;
    }
}
