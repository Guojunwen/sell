package com.gary.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by Guo on 2017/11/23.
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    //0正常1下架
    private Integer productStatus;
    private Integer categoryType;
}
