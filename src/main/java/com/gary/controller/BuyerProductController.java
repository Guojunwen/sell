package com.gary.controller;

import com.gary.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Guo on 2017/11/24.
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @RequestMapping("/list")
    public ResultVO list(){
       ResultVO resultVO=new ResultVO();
       return resultVO;
    }
}
