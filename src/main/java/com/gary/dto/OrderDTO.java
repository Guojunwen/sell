package com.gary.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.gary.dataobject.OrderDetail;
import com.gary.enums.OrderStatusEnum;
import com.gary.enums.PayStatusEnum;
import com.gary.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Guo on 2017/11/26.
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;
    private List<OrderDetail> orderDetailList;
}
