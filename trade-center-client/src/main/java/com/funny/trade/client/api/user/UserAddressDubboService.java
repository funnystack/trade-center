package com.funny.trade.client.api.user;


import com.funny.trade.client.dto.user.UserAddressInfo;

import java.util.List;

/**
 * 用户地址
 */
public interface UserAddressDubboService {

    /**
     * 查询用户的地址列表
     * @param userId
     * @return
     */
    List<UserAddressInfo> listAllUserAddress(Long userId);


    /**
     * 新增用户地址
     * @return
     */
    boolean addUserAddress(UserAddressInfo userAddressDTO);

    /**
     * 修改用户地址
     * @param userAddressDTO
     * @return
     */
    boolean updateUserAddress(UserAddressInfo userAddressDTO);

    /**
     * 查询地址id信息
     * @param id
     * @return
     */
    UserAddressInfo getUserAddressById(Long id);

    /**
     * 删除收货地址
     * @param id
     * @param userId
     * @return
     */
    boolean deleteAddress(Long id,Long userId);
}
