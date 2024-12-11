package com.example.demo.service;

import com.example.demo.model.Orders;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Orders saveOrder(Orders order) {
        return orderRepository.save(order);
    }

    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }

    // Update the order status based on the order ID and new status
    public Orders updateOrderStatus(Long orderId, String status) {
        // Fetch the order by ID, throw exception if not found
        Orders order = orderRepository.findById(orderId)
                                      .orElseThrow(() -> new RuntimeException("Order not found"));

        // Update the status of the order
        order.setStatus(status);

        // Save the updated order back to the repository
        return orderRepository.save(order);
    }

    public List<Orders> getOrdersByStatus(String status) {
        return orderRepository.findByStatus(status);
    }
}
