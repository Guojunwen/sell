package com.gary.service.impl;

import com.gary.dataobject.OrderDetail;
import com.gary.dto.OrderDTO;
import com.gary.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Guo on 2017/12/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID="110110";

    @Test
    public void create() throws Exception {

        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setBuyerName("Master");
        orderDTO.setBuyerAddress("CaseSoft");
        orderDTO.setBuyerPhone("1234567898");
        orderDTO.setBuyerOpenid(BUYER_OPENID);
        orderDTO.setPayStatus(PayStatusEnum.WAIT.getCode());

        //购物车
        List<OrderDetail> orderDetailList=new ArrayList<>();
        OrderDetail o1=new OrderDetail();
        o1.setProductId("123456");
        o1.setProductQuantity(1);
        orderDetailList.add(o1);

        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result=orderService.create(orderDTO);
        log.info("创建订单 result={}",result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findList() throws Exception {
    }

    @Test
    public void cancel() throws Exception {
    }

    @Test
    public void finish() throws Exception {
    }

    @Test
    public void paid() throws Exception {
    }

}