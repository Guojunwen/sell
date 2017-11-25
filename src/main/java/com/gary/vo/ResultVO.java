package com.gary.vo;

import lombok.Data;

/**
 * Created by Guo on 2017/11/24.
 */
@Data
public class ResultVO<T> {
    private Integer  code;
    private String msg;
    private T data;
}
