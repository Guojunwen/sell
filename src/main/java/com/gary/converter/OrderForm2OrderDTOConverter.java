package com.gary.converter;

import com.gary.dataobject.OrderDetail;
import com.gary.dto.OrderDTO;
import com.gary.enums.ResultEnum;
import com.gary.exception.SellException;
import com.gary.form.OrderForm;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gary on 2017/12/31.
 */
@Slf4j
public class OrderForm2OrderDTOConverter {
  public static OrderDTO convert(OrderForm orderForm){

      Gson gson=new Gson();
      OrderDTO orderDTO=new OrderDTO();
      orderDTO.setBuyerName(orderForm.getName());
      orderDTO.setBuyerPhone(orderForm.getPhone());
      orderDTO.setBuyerAddress(orderForm.getAddress());
      orderDTO.setBuyerOpenid(orderForm.getOpenid());
      List<OrderDetail> orderDetailList=new ArrayList<>();
      try {
          orderDetailList=gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {
          }.getType());
      }catch (Exception e){
         log.error("[对象装换]错误，string={}",orderForm.getItems());
         throw new SellException(ResultEnum.PARAM_ERROR);
      }
      orderDTO.setOrderDetailList(orderDetailList);
      return orderDTO;
  }
}
