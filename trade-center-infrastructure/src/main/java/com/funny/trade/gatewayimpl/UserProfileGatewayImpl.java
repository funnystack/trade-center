package com.funny.trade.gatewayimpl;

import com.funny.trade.domain.gateway.UserProfileGateway;
import com.funny.trade.domain.metrics.techcontribution.ContributionMetric;
import com.funny.trade.domain.metrics.weight.WeightFactory;
import com.funny.trade.domain.user.Role;
import com.funny.trade.domain.user.UserProfile;
import com.funny.trade.gatewayimpl.database.UserProfileMapper;
import com.funny.trade.gatewayimpl.database.dataobject.UserProfileDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * UserProfileGatewayImpl
 *
 * @author Frank Zhang
 * @date 2020-07-02 12:32 PM
 */
@Component
public class UserProfileGatewayImpl implements UserProfileGateway {
    private static Logger logger = LoggerFactory.getLogger(ContributionMetric.class);

    @Resource
    private UserProfileMapper userProfileMapper;


    public void create(UserProfile userProfile){
//        userProfileMapper.create(UserProfileConvertor.toDataObjectForCreate(userProfile));
    }

    public void update(UserProfile userProfile){
//        userProfileMapper.update(UserProfileConvertor.toDataObjectForUpdate(userProfile));
    }

    public UserProfile getByUserId(String userId){
        UserProfileDO userProfileDO = userProfileMapper.getByUserId(userId);
        if(userProfileDO == null){
            logger.warn("There is no UserProfile for : "+userId);
            return null;
        }
        UserProfile userProfile = DomainFactory.getUserProfile();
        BeanUtils.copyProperties(userProfileDO, userProfile);
        Role role = Role.valueOf(userProfileDO.getRole());
        userProfile.setRole(role);
        userProfile.setWeight(WeightFactory.get(role));
        return userProfile;
    }

}
