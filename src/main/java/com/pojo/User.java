package com.pojo;

import com.entity.UserEntity;
import lombok.*;

import javax.transaction.Transactional;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class User {
    private Integer userId;
    private String username;
    private String password;

    public User(UserEntity userEntity){
        userId = userEntity.getUserId();
        username = userEntity.getUsername();
        password = userEntity.getPassword();
    }
}
