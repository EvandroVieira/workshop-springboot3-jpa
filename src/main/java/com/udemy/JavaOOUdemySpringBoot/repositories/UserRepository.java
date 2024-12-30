package com.udemy.JavaOOUdemySpringBoot.repositories;

import com.udemy.JavaOOUdemySpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
