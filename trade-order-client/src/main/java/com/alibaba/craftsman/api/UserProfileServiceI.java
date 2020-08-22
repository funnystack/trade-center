package com.alibaba.craftsman.api;

import com.alibaba.craftsman.dto.*;
import com.alibaba.craftsman.dto.clientobject.UserProfileCO;
import com.funny.combo.core.result.MultiResponse;
import com.funny.combo.core.result.Response;
import com.funny.combo.core.result.SingleResponse;


/**
 * UserProfileServiceI
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:15 PM
 */
public interface UserProfileServiceI {
    Response addUserProfile(UserProfileAddCmd cmd);

    Response updateUserProfile(UserProfileUpdateCmd cmd);

    Response refreshScore(RefreshScoreCmd cmd);

    SingleResponse<UserProfileCO> getUserProfileBy(UserProfileGetQry qry);

    MultiResponse<UserProfileCO> listUserProfileBy(UserProfileListQry qry);
}
