package com.user.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    LOGIN_FAIL(1, "log in failed"),
    ROLE_ERROR(2, "authentication error"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
