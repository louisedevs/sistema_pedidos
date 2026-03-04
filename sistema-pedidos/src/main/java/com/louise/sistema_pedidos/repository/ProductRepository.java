package com.louise.sistema_pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.louise.sistema_pedidos.model.Product;


public interface ProductRepository extends JpaRepository <Product, Long> {
}
