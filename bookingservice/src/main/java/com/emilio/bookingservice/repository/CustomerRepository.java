package com.emilio.bookingservice.repository;

import com.emilio.bookingservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
