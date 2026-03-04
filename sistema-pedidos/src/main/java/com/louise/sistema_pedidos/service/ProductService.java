package com.louise.sistema_pedidos.service;

import com.louise.sistema_pedidos.model.Product;
import com.louise.sistema_pedidos.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {

    private ProductRepository productRepository;

    public ProductService (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public  Product getProductbyId (Long id) {
        return productRepository.findById(id).orElse(null);
    }

}
