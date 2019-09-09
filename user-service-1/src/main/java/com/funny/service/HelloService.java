package com.funny.service;


import com.funny.entity.UserEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Service
public class HelloService {

    @Value("${server.port}")
    String port;

    public UserEntity findById(Long id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(id);
        userEntity.setUserName("fang,port:" +port);
        return userEntity;
    }

}
