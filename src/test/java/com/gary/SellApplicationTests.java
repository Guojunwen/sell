package com.gary;

import com.gary.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test(){
		ProductInfo productInfo=new ProductInfo();
		productInfo.setProductName("guo");
		ProductInfo p=new ProductInfo();
		p.setProductDescription("ceshi");
		BeanUtils.copyProperties(p,productInfo);
		System.out.println(productInfo);
	}

}
