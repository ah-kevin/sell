package com.lennon.sell.service.impl;

import com.lennon.sell.dto.OrderDTO;
import com.lennon.sell.service.OrderService;
import com.lennon.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {
    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;
    @Test
    public void create() throws Exception{
        OrderDTO orderDTO = orderService.findOne("1529920307713658351");
        payService.create(orderDTO);
    }
    @Test
    public  void refund(){
        OrderDTO orderDTO = orderService.findOne("1532530042571397454");
         payService.refund(orderDTO);
    }
}