package com.gary.enums;

/**
 * Created by Guo on 2017/11/23.
 */

import lombok.Getter;

/**
 * 商品状态
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
