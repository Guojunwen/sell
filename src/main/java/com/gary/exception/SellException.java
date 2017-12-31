package com.gary.exception;

import com.gary.enums.ResultEnum;

/**
 * Created by Guo on 2017/11/26.
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
      super(resultEnum.getMessage());
      this.code=resultEnum.getCode();
    }

    public SellException (Integer code,String message){
        super(message);
        this.code=code;
    }
}
