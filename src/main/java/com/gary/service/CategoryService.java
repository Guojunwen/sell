package com.gary.service;

import com.gary.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by Guo on 2017/11/22.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
