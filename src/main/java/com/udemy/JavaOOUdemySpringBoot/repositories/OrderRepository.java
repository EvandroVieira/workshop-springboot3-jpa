package com.udemy.JavaOOUdemySpringBoot.repositories;

import com.udemy.JavaOOUdemySpringBoot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
