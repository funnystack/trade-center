package com.funny.trade.domain.item.service;

import com.funny.trade.client.dto.item.ItemDTO;
import com.funny.trade.client.dto.item.QueryItemParam;
import com.funny.trade.client.dto.order.ReceiveOrderDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemDomainService {

    public List<ItemDTO> queryItemInfo(List<QueryItemParam> queryItemParams) {
        List<ItemDTO> list = new ArrayList<>();

        return list;
    }

    public void increaseStock(ReceiveOrderDTO receiveOrderDTO, List<ItemDTO> itemDTOList) {
        System.out.println("还库存成功:skuId={}" + itemDTOList.get(0).getSkuId());
    }

    public void decreaseStock(ReceiveOrderDTO receiveOrderDTO, List<ItemDTO> itemDTOList) {
        System.out.println("扣减库存成功:skuId={}" + itemDTOList.get(0).getSkuId());
    }
}
