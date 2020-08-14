package com.webservice.json.Service;

import com.webservice.json.Entity.Product_Promotion;
import com.webservice.json.Repository.promotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements promotionService {


    @Autowired
    promotionRepository repository;

    @Override
    public List<Product_Promotion> getAllProducts() {
        return repository.findAllByFlagIsTrue();
    }

    @Override
    public Product_Promotion findById(Integer id) {
        return repository.findById(id).orElse(null);
    }


    @Override
    public void save(Product_Promotion product_promotion) {
        repository.save(product_promotion);
    }
}
