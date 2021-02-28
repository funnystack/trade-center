package com.funny.trade.client.api.user;


import com.funny.trade.client.dto.user.UserInvoiceInfoDTO;

import java.util.List;

/**
 * 用户开票信息
 */
public interface UserInvoiceDubboService {

    /**
     * 查询用户的开票信息
     * @param userId
     * @return
     */
    List<UserInvoiceInfoDTO> listAllUserInvoice(Long userId);


    /**
     * 新增用户开票信息
     * @return
     */
    boolean addUserInvoice(UserInvoiceInfoDTO userInvoiceDTO);

    /**
     * 修改用户开票信息
     * @param userInvoiceDTO
     * @return
     */
    boolean updateUserInvoice(UserInvoiceInfoDTO userInvoiceDTO);

    /**
     * 查询开票信息
     * @param id
     * @return
     */
    UserInvoiceInfoDTO getUserInvoiceById(Long id);

    /**
     * 删除开票信息
     * @param id
     * @param userId
     * @return
     */
    boolean deleteUserInvoice(Long id, Long userId);
}
