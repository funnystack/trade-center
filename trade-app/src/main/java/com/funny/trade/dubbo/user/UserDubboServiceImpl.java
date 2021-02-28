package com.funny.trade.dubbo.user;

import com.funny.combo.core.result.SingleResponse;
import com.funny.trade.client.api.user.UserDubboService;
import com.funny.trade.client.dto.user.UserInfoDTO;
import com.funny.trade.domain.user.entity.UserInfoEntity;
import com.funny.trade.gatewayimpl.database.user.UserInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.Objects;

@Service("userDubboService")
public class UserDubboServiceImpl implements UserDubboService {
    private static final Logger logger = LoggerFactory.getLogger(UserDubboServiceImpl.class);
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public SingleResponse<UserInfoDTO> queryByUserId(Long userId) {

        if(Objects.isNull(userId) || userId <0L){
            return SingleResponse.fail("userId is null ");
        }

        try {
            UserInfoEntity userInfoEntity = userInfoMapper.findEntityById(userId);
            UserInfoDTO userInfoDTO = new UserInfoDTO();
            BeanUtils.copyProperties(userInfoEntity, userInfoDTO);
            return SingleResponse.succ(userInfoDTO);
        } catch (BeansException e) {
            e.printStackTrace();
            logger.error("查询用户信息失败,userId={}",userId,e);
            return SingleResponse.fail("查询用户信息失败,"+e.getMessage());
        }

    }

    @Override
    public SingleResponse addUserInfo(UserInfoDTO userInfoDTO) {
        userInfoDTO.setUserName("fangli");
        userInfoDTO.setUserPwd(DigestUtils.md5DigestAsHex("123456".getBytes()));
        userInfoDTO.setMobile("18610508781");
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        BeanUtils.copyProperties(userInfoDTO,userInfoEntity);
        userInfoMapper.insertSelective(userInfoEntity);
        return SingleResponse.succ();
    }
}
