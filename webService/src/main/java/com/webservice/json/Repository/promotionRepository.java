package com.webservice.json.Repository;

import com.webservice.json.Entity.Product_Promotion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface promotionRepository extends JpaRepository<Product_Promotion, Integer> {
    List<Product_Promotion> findAllByFlagIsTrue();

}
