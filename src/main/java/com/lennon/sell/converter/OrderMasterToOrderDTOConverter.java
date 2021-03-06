package com.lennon.sell.converter;

import com.lennon.sell.dataobject.OrderMaster;
import com.lennon.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class OrderMasterToOrderDTOConverter {
    public static OrderDTO convert(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(OrderMasterToOrderDTOConverter::convert).collect(Collectors.toList());
    }
}
