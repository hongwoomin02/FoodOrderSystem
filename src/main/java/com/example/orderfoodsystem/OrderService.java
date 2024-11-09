package com.example.orderfoodsystem;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public List<OrderDTO> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        List<OrderDTO> AllOrders = new ArrayList<>();
        for (Order order : orders) {
            AllOrders.add(new OrderDTO(order.getId(), order.getName(), order.getCount()));
        }
        return AllOrders;
    }




}
