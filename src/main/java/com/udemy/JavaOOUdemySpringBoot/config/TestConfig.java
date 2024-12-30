package com.udemy.JavaOOUdemySpringBoot.config;

import com.udemy.JavaOOUdemySpringBoot.entities.Order;
import com.udemy.JavaOOUdemySpringBoot.entities.User;
import com.udemy.JavaOOUdemySpringBoot.entities.enums.OrderStatus;
import com.udemy.JavaOOUdemySpringBoot.repositories.OrderRepository;
import com.udemy.JavaOOUdemySpringBoot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "1233456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "1233456");

        Order o1 = new Order(null, Instant.parse("2024-11-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2024-12-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2024-12-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}