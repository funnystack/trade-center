package com.funny.trade.command;

import com.funny.trade.convertor.UserProfileConvertor;
import com.funny.trade.domain.gateway.UserProfileGateway;
import com.funny.trade.domain.user.UserProfile;
import com.funny.trade.dto.UserProfileAddCmd;
import com.funny.combo.core.result.Response;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * UserProfileAddCmdExe
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:25 PM
 */
@Component
public class UserProfileAddCmdExe{

    @Resource
    private UserProfileGateway userProfileGateway;

    public Response execute(UserProfileAddCmd cmd) {
        UserProfile userProfile = UserProfileConvertor.toEntity(cmd.getUserProfileCO());
        userProfileGateway.create(userProfile);
        return Response.buildSuccess();
    }
}
