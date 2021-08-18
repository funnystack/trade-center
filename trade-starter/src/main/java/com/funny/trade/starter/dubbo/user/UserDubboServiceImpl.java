package com.funny.trade.starter.dubbo.user;

import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.application.service.UserApplicationService;
import com.funny.trade.client.api.user.UserDubboService;
import com.funny.trade.client.dto.user.UserInfoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userDubboService")
public class UserDubboServiceImpl implements UserDubboService {
    private static final Logger logger = LoggerFactory.getLogger(UserDubboServiceImpl.class);
    @Resource
    private UserApplicationService userApplicationService;

    @Override
    public SingleResponse<UserInfoDTO> queryByUserId(Long userId) {
        return SingleResponse.succ();
    }

    @Override
    public SingleResponse addUserInfo(UserInfoDTO userInfoDTO) {

        return SingleResponse.succ();
    }
}
