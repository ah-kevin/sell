package com.lennon.sell.service.impl;

import com.lennon.sell.dataobject.OrderDetail;
import com.lennon.sell.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {
    private final String BUYER_OPENID ="110110";
    @Autowired
    private  OrderServiceImpl orderService;
    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("lennon");
        orderDTO.setBuyerAddress("宝利丰");
        orderDTO.setBuyerPhone("12321321");
        orderDTO.setBuyerOpenid(BUYER_OPENID);
        // 购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("123458");
        orderDetail.setProductQuantity(1);
        orderDetailList.add(orderDetail);
        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductId("123457");
        orderDetail2.setProductQuantity(10);
        orderDetailList.add(orderDetail2);
        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = orderService.create(orderDTO);
        log.info("[创建订单] result ={}",result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
    }

    @Test
    public void findList() {
    }

    @Test
    public void cancel() {
    }

    @Test
    public void finish() {
    }

    @Test
    public void paid() {
    }
}