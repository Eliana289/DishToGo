package com.order.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {

    @NotEmpty(message = "name cannot be empty")
    private String name;

    @NotEmpty(message = "phone cannot be empty")
    private String phone;

    @NotEmpty(message = "address cannot be empty")
    private String address;

    @NotEmpty(message = "openid cannot be empty")
    private String openid;

    @NotEmpty(message = "cart cannot be empty")
    private String items;

}
