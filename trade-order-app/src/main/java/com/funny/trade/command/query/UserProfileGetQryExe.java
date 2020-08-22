package com.funny.trade.command.query;

import com.funny.trade.dto.UserProfileGetQry;
import com.funny.trade.gatewayimpl.database.UserProfileMapper;
import com.funny.trade.gatewayimpl.database.dataobject.UserProfileDO;
import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.dto.clientobject.UserProfileCO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileGetQryExe {

    @Resource
    private UserProfileMapper userProfileMapper;

    public SingleResponse<UserProfileCO> execute(UserProfileGetQry qry) {
        UserProfileDO userProfileDO = userProfileMapper.getByUserId(qry.getUserId());
        UserProfileCO userProfileCO = new UserProfileCO();
        BeanUtils.copyProperties(userProfileDO, userProfileCO);
        return SingleResponse.of(userProfileCO);
    }

}
