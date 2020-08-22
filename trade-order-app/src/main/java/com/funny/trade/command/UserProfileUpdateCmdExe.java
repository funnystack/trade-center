package com.funny.trade.command;

import com.funny.trade.convertor.UserProfileConvertor;
import com.funny.trade.domain.gateway.UserProfileGateway;
import com.funny.trade.domain.user.UserProfile;
import com.funny.trade.dto.UserProfileUpdateCmd;
import com.funny.combo.core.result.Response;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserProfileUpdateCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileUpdateCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.update(userProfile);
        return Response.buildSuccess();
    }
}