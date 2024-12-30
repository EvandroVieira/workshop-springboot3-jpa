package com.udemy.JavaOOUdemySpringBoot.repositories;

import com.udemy.JavaOOUdemySpringBoot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
