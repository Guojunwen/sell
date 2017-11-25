package com.gary.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Guo on 2017/11/19.
 */
@Table(name="ProductCategory")
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    @Id
    @GeneratedValue
    private Integer categoryId;//类目
    private String categoryName;//类目名字
    private Integer categoryType;//类目编号

    public ProductCategory(String categoryName, int categoryType) {
        this.categoryName=categoryName;
        this.categoryType=categoryType;
    }

    public ProductCategory() {
    }
}
