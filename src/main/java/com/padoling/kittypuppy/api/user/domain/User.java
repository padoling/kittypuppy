package com.padoling.kittypuppy.api.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String userName;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private LocalDateTime createDate;

    @Builder
    public User(String email, String password, String userName, UserType userType, LocalDateTime createDate) {
        this.email = email;
        this.password = password;
        this.userName = userName;
        this.userType = userType;
        this.createDate = createDate;
    }
}
