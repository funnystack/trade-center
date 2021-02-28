package com.funny.trade.controller;

import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.client.api.user.UserDubboService;
import com.funny.trade.client.dto.user.UserInfoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Created by Joe on 2020-03-12.
 */
@RestController
public class UserController {
    @Resource
    private UserDubboService userDubboService;

    @GetMapping("/user/{userId}")
    public SingleResponse<UserInfoDTO> queryByUserId(@PathVariable Long userId) {
        return userDubboService.queryByUserId(userId);
    }

}
