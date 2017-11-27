package com.gary.service.impl;

import com.gary.dataobject.ProductInfo;
import com.gary.dto.CartDTO;
import com.gary.enums.ProductStatusEnum;
import com.gary.enums.ResultEnum;
import com.gary.exception.SellException;
import com.gary.repository.ProductInfoRepository;
import com.gary.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Transient;
import java.util.List;

/**
 * Created by Guo on 2017/11/23.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {

    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
       for (CartDTO cartDTO:cartDTOList){
           ProductInfo productInfo=repository.findOne(cartDTO.getProductId());
           if (productInfo == null){
               throw  new SellException(ResultEnum.PRODUCT_NOT_EXIST);
           }

           Integer result=productInfo.getProductStock()-cartDTO.getProductQuantity();
           if (result<0){
               throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
           }

           productInfo.setProductStock(result);
           repository.save(productInfo);
       }
    }
}
