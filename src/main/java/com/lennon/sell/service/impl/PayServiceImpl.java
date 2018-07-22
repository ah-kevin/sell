package com.lennon.sell.service.impl;

import com.lennon.sell.dto.OrderDTO;
import com.lennon.sell.service.PayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {
    @Override
    public void create(OrderDTO orderDTO){
        BestPayServiceImpl bestPayService = new BestPayServiceImpl();

    }
}
