package com.user.enums;

import lombok.Getter;


@Getter
public enum RoleEnum {
	BUYER(1, "user"),
	SELLER(2, "restaurant"),
	;

	private Integer code;

	private String message;

	RoleEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
