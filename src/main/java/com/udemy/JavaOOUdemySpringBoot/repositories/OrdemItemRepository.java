package com.udemy.JavaOOUdemySpringBoot.repositories;

import com.udemy.JavaOOUdemySpringBoot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {
}
