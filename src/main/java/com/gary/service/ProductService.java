package com.gary.service;

import com.gary.dataobject.ProductInfo;
import com.gary.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Guo on 2017/11/23.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    //查询所有在架的商品
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
