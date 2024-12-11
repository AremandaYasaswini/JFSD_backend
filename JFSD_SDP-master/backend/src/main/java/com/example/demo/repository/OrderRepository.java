package com.example.demo.repository;

import com.example.demo.model.Orders;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
	public List<Orders> findByStatus(String status);
}
