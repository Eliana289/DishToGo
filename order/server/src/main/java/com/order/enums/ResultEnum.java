package com.order.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "parameter error"),
    CART_EMPTY(2, "cart empty"),
    ORDER_NOT_EXIST(3, "no such order"),
    ORDER_STATUS_ERROR(4, "order status error"),
    ORDER_DETAIL_NOT_EXIST(5, "no order detail"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
