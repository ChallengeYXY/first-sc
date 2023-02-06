package com.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 结果类
 * 用于向前端返回数据
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> implements Serializable {
    private Integer code;//状态码
    private String messqge;//返回的消息
    private T object;//要返回的数据

    public Result(Integer code, String messqge) {
        this.code = code;
        this.messqge = messqge;
    }
}
