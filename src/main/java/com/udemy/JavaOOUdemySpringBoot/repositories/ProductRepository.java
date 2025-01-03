package com.udemy.JavaOOUdemySpringBoot.repositories;

import com.udemy.JavaOOUdemySpringBoot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
