package com.funny.trade.dubbo;

import com.funny.combo.core.result.CommonResult;
import com.funny.trade.client.api.user.UserDubboService;
import com.funny.trade.client.dto.user.UserInfo;
import org.springframework.stereotype.Service;

@Service("userDubboService")
public class UserDubboServiceImpl implements UserDubboService {
    @Override
    public CommonResult<UserInfo> queryByUserId(Long userId) {



        return null;
    }

    @Override
    public CommonResult addUserInfo(UserInfo tradeUserInfo) {
        return null;
    }
}
