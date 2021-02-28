package com.funny.trade.client.api.user;


import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.client.dto.user.UserInfoDTO;

public interface UserDubboService {

    SingleResponse<UserInfoDTO> queryByUserId(Long userId);

    SingleResponse addUserInfo(UserInfoDTO tradeUserInfoDTO);
}
