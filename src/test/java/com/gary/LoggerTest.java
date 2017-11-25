package com.gary;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Guo on 2017/11/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j
public class LoggerTest {

    private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name="guo";
        logger.info("info....");
        logger.info("name: {}",name);
        logger.error("error....");
//        try{
//            List list=new ArrayList();
//            list.get(2).toString();
//        }catch (Exception e){
//            e.printStackTrace();
//            //logger.error(e.printStackTrace());
//        }
    }
}
