package com.example.demo.controller;

import com.example.demo.model.Orders;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public ResponseEntity<String> createOrder(@RequestBody Orders order) {
        orderService.saveOrder(order); 
        return ResponseEntity.ok("Order created successfully");
    }

    @GetMapping
    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.ok("Order deleted successfully");
    }

    @PatchMapping("/{id}/update")
    public ResponseEntity<Orders> updateOrderStatus(@PathVariable Long id, @RequestBody Map<String, String> updates) {
        String newStatus = updates.get("status");
        Orders updatedOrder = orderService.updateOrderStatus(id, newStatus);

        return ResponseEntity.ok(updatedOrder);
    }

    @GetMapping("/confirmed")
    public ResponseEntity<List<Orders>> getConfirmedOrders() {
        List<Orders> confirmedOrders = orderService.getOrdersByStatus("Confirmed");
        return ResponseEntity.ok(confirmedOrders);
    }

    @GetMapping("/cancelled")
    public ResponseEntity<List<Orders>> getCancelledOrders() {
        List<Orders> cancelledOrders = orderService.getOrdersByStatus("Cancelled");
        return ResponseEntity.ok(cancelledOrders);
    }
}
