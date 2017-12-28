package com.gary.controller;

import com.gary.form.OrderForm;
import com.gary.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by gary on 2017/12/18.
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {
    //创建订单
    public ResultVO<Map<String,String>>create(@Valid OrderForm orderForm,BindingResult buildingResult){
        if (buildingResult.hasErrors()){
            log.error("[创建订单]");
        }
    }
    //订单列表

    //订单详情

    //取消订单
}
