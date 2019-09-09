package com.funny.web;

import com.funny.entity.UserEntity;
import com.funny.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class OrderControler {

    @Autowired
    private HelloService helloService;


    @RequestMapping(value = "/createOrder")
    public UserEntity findById(@RequestParam Long id){
        return helloService.findById(id);
    }



}
