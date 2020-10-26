package com.product.service;

import com.product.common.DecreaseStockInput;
import com.product.common.ProductInfoOutput;
import com.product.dataobject.ProductInfo;

import java.util.List;


public interface ProductService {

    List<ProductInfo> findUpAll();

    /**
     * search product list
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * stock decrease
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
