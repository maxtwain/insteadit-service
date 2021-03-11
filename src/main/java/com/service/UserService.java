package com.service;

import com.access.UserDao;
import com.entity.UserEntity;
import com.pojo.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final UserDao userDao;

    public void save(User user){
        UserEntity userEntity = new UserEntity(user);

        // TODO: if the user's comments and threads exist, set missing fields

        userDao.save(userEntity);
    }
    public void saveExperiment(User user){
        UserEntity userEntity = new UserEntity(user);

        userDao.save(userEntity);
    }
}
