package com.funny.trade.client.api.user;


import com.funny.combo.core.result.CommonResult;
import com.funny.trade.client.dto.user.UserInfo;

public interface UserDubboService {

    CommonResult<UserInfo> queryByUserId(Long userId);

    CommonResult addUserInfo(UserInfo tradeUserInfo);
}
