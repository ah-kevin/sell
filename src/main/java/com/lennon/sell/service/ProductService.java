package com.lennon.sell.service;

import com.lennon.sell.dataobject.ProductInfo;
import com.lennon.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所在架商品列表
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);
    // 加库存
    void increaseStock(List<CartDTO >cartDTOList);
    // 减库存
    void decreaseStock(List<CartDTO >cartDTOList);

}
