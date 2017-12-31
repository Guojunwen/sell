package com.gary.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by gary on 2017/12/18.
 */
@Data
public class OrderForm {

    @NotEmpty(message="姓名必填")
    private String name;//买家姓名
    @NotEmpty(message="手机号必填")
    private String phone;
    @NotEmpty(message = "地址必填")
    private String address;
    @NotEmpty(message = "opendid必填")
    private String openid;//买家微信openid
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
