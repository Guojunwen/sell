package com.gary.service;

import com.gary.dto.OrderDTO;

/**
 * 买家
 * Created by Guo on 2017/12/31.
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
