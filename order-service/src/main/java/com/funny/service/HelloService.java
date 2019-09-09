package com.funny.service;


import com.alibaba.fastjson.JSON;
import com.funny.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancer;

    public UserEntity findById(Long id) {
        ServiceInstance serviceInstance = loadBalancer.choose("user-service");
        System.out.println("服务地址：" + serviceInstance.getUri());
        System.out.println("服务名称：" + serviceInstance.getServiceId());
        UserEntity userEntity = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/findById", UserEntity.class,id);
        System.out.println(JSON.toJSONString(userEntity));
        return userEntity;
    }

}
