package com.example.myproject.services;

import com.example.myproject.model.Product;
import com.example.myproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }

    public void deleteById(int id){
        productRepository.deleteById(id);

    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product getById(int id) {
        return productRepository.getById(id);
    }


}
