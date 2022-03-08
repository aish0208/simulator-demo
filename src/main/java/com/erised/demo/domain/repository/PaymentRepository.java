package com.erised.demo.domain.repository;


import com.erised.demo.domain.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    @Query("SELECT p FROM Payment p WHERE p.pspreference = :pspreference")
    Payment findByPspReference(@Param("pspreference") String pspreference);
}