package com.padoling.kittypuppy.api.user.service;

import com.padoling.kittypuppy.api.user.domain.User;
import com.padoling.kittypuppy.api.user.domain.UserRepository;
import com.padoling.kittypuppy.api.user.model.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    private final ModelMapper modelMapper;

    public Long addUser(UserVO userVO) {
        if(userRepository.findBySocialTypeAndSocialUid(userVO.getSocialType(), userVO.getSocialUid()).isPresent()) {
            log.error("User save failed cause requested user already exists");
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
        return userRepository.save(userVOToEntity(userVO)).getId();
    }

    private User userVOToEntity(UserVO userVO) {
        return modelMapper.map(userVO, User.class);
    }

}
