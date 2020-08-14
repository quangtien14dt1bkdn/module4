package com.webservice.json;

import com.webservice.json.Entity.Product_Promotion;
import com.webservice.json.Service.promotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping(value = "/discountList")
public class controller {

    @Autowired
    promotionService service;

    @GetMapping("")
    public List<Product_Promotion> list() {
        return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product_Promotion> getProductById(@PathVariable int id) {
        try {
            Product_Promotion product = service.findById(id);
            return new ResponseEntity<Product_Promotion>(product, HttpStatus.OK);
        } catch (NoSuchElementException exception) {
            return new ResponseEntity<Product_Promotion>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/product")
    public void add(@RequestBody Product_Promotion product) {
        service.save(product);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<?> update(@RequestBody Product_Promotion product, @PathVariable Integer id) {
        try {
            Product_Promotion existProduct = service.findById(id);
            service.save(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<Product_Promotion> delete(@PathVariable Integer id) {
        try {
            Product_Promotion product = service.findById(id);
            product.setFlag(false);
            return new ResponseEntity<Product_Promotion>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
