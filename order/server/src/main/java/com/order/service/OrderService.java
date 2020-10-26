package com.order.service;

import com.order.dto.OrderDTO;


public interface OrderService {

    OrderDTO create(OrderDTO orderDTO);

    OrderDTO finish(String orderId);
}
