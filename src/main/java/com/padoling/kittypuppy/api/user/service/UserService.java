package com.padoling.kittypuppy.api.user.service;

import com.padoling.kittypuppy.api.user.domain.User;
import com.padoling.kittypuppy.api.user.domain.UserRepository;
import com.padoling.kittypuppy.api.user.domain.UserType;
import com.padoling.kittypuppy.common.util.JwtUtil;
import com.padoling.kittypuppy.model.user.SignInRequestDto;
import com.padoling.kittypuppy.model.user.SignUpRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public Long saveUser(SignUpRequestDto request) {
        User user = User.builder()
                .email(request.getEmail())
                .password(request.getPassword())
                .userName(request.getUserName())
                .userType(UserType.USER)
                .createDate(LocalDateTime.now())
                .build();

        return userRepository.save(user).getId();
    }

    public String createToken(SignInRequestDto request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("User email not found."));

        if(!user.getPassword().equals(request.getPassword())) {
            throw new IllegalArgumentException("Wrong password.");
        }

        return jwtUtil.createToken();
    }
}
