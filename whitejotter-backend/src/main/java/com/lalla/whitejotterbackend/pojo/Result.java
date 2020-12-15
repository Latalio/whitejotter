package com.lalla.whitejotterbackend.pojo;

import lombok.Data;

@Data
public class Result {

    int code;

    public Result(int code) {
        this.code = code;
    }
}
