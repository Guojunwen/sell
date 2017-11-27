package com.gary.dto;

import lombok.Data;

/**
 * Created by Guo on 2017/11/27.
 */
@Data
public class CartDTO {
    //商品Id
    private String productId;
    //数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
