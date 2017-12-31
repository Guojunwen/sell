package com.gary.controller;

import com.gary.converter.OrderForm2OrderDTOConverter;
import com.gary.dto.OrderDTO;
import com.gary.enums.ResultEnum;
import com.gary.exception.SellException;
import com.gary.form.OrderForm;
import com.gary.service.OrderService;
import com.gary.utils.ResultVOUtil;
import com.gary.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gary on 2017/12/18.
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;

    //创建订单
    @RequestMapping("/create")
    public ResultVO<Map<String,String>>create(@Valid OrderForm orderForm,BindingResult buildingResult){
        if (buildingResult.hasErrors()){
            log.error("[创建订单] 参数不正确,orderForm={}"+orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    buildingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO= OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("[创建订单]购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO createResult=orderService.create(orderDTO);
        Map<String,String> map=new HashMap<>();
        map.put("orderId",createResult.getOrderId());
        return ResultVOUtil.success();
    }
    //订单列表

    //订单详情

    //取消订单
}
