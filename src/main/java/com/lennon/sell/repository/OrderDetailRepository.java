package com.lennon.sell.repository;

import com.lennon.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDetailRepository  extends JpaRepository<OrderDetail,String > {
    List<OrderDetail> findByOrderId(String orderId);
}
