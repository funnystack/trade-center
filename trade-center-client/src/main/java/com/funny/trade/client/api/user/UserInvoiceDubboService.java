package com.funny.trade.client.api.user;


import com.funny.trade.client.dto.user.UserInvoiceInfo;

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
    List<UserInvoiceInfo> listAllUserInvoice(Long userId);


    /**
     * 新增用户开票信息
     * @return
     */
    boolean addUserInvoice(UserInvoiceInfo userInvoiceDTO);

    /**
     * 修改用户开票信息
     * @param userInvoiceDTO
     * @return
     */
    boolean updateUserInvoice(UserInvoiceInfo userInvoiceDTO);

    /**
     * 查询开票信息
     * @param id
     * @return
     */
    UserInvoiceInfo getUserInvoiceById(Long id);

    /**
     * 删除开票信息
     * @param id
     * @param userId
     * @return
     */
    boolean deleteUserInvoice(Long id, Long userId);
}
