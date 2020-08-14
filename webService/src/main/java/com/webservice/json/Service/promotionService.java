package com.webservice.json.Service;

import com.webservice.json.Entity.Product_Promotion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface promotionService {
    List<Product_Promotion> getAllProducts();

    Product_Promotion findById(Integer id);

    void save(Product_Promotion product_promotion);
}
