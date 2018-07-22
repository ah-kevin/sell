package com.lennon.sell.service;

import com.lennon.sell.dto.OrderDTO;

/**
 * 支付
 */
public interface PayService {
    void create(OrderDTO orderDTO);
}
