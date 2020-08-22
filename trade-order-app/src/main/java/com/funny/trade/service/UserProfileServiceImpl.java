package com.funny.trade.service;

import com.funny.trade.api.UserProfileServiceI;
import com.funny.trade.command.RefreshScoreCmdExe;
import com.funny.trade.command.UserProfileAddCmdExe;
import com.funny.trade.command.UserProfileUpdateCmdExe;
import com.funny.trade.command.query.UserProfileGetQryExe;
import com.funny.trade.command.query.UserProfileListQryExe;
import com.funny.trade.dto.*;
import com.funny.trade.dto.clientobject.UserProfileCO;
import com.funny.combo.core.result.MultiResponse;
import com.funny.combo.core.result.Response;
import com.funny.combo.core.result.SingleResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserProfileServiceImpl
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:22 PM
 */
@Service
public class UserProfileServiceImpl implements UserProfileServiceI{
    @Resource
    private UserProfileAddCmdExe userProfileAddCmdExe;
    @Resource
    private UserProfileUpdateCmdExe userProfileUpdateCmdExe;
    @Resource
    private RefreshScoreCmdExe refreshScoreCmdExe;
    @Resource
    private UserProfileGetQryExe userProfileGetQryExe;
    @Resource
    private UserProfileListQryExe userProfileListQryExe;


    @Override
    public Response addUserProfile(UserProfileAddCmd userProfileAddCmd) {
        return  userProfileAddCmdExe.execute(userProfileAddCmd);
    }

    @Override
    public Response updateUserProfile(UserProfileUpdateCmd cmd) {
        return userProfileUpdateCmdExe.execute(cmd);
    }

    @Override
    public Response refreshScore(RefreshScoreCmd cmd) {
        return refreshScoreCmdExe.execute(cmd);
    }

    @Override
    public SingleResponse<UserProfileCO> getUserProfileBy(UserProfileGetQry qry) {
        return userProfileGetQryExe.execute(qry);
    }

    @Override
    public MultiResponse<UserProfileCO> listUserProfileBy(UserProfileListQry qry) {
        return userProfileListQryExe.execute(qry);
    }
}
