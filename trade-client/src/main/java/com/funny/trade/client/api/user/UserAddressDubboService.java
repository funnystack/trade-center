package com.funny.trade.client.api.user;


import com.funny.trade.client.dto.user.UserAddressInfoDTO;

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
    List<UserAddressInfoDTO> listAllUserAddress(Long userId);


    /**
     * 新增用户地址
     * @return
     */
    boolean addUserAddress(UserAddressInfoDTO userAddressDTO);

    /**
     * 修改用户地址
     * @param userAddressDTO
     * @return
     */
    boolean updateUserAddress(UserAddressInfoDTO userAddressDTO);

    /**
     * 查询地址id信息
     * @param id
     * @return
     */
    UserAddressInfoDTO getUserAddressById(Long id);

    /**
     * 删除收货地址
     * @param id
     * @param userId
     * @return
     */
    boolean deleteAddress(Long id,Long userId);
}
