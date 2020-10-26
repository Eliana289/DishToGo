package com.product.enums;

import lombok.Getter;


@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1, "product doesn't exist"),
    PRODUCT_STOCK_ERROR(2, "inventory error"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
