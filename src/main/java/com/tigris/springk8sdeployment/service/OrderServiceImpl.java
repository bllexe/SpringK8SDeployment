package com.tigris.springk8sdeployment.service;

import com.tigris.springk8sdeployment.entity.Order;
import com.tigris.springk8sdeployment.repo.OrderRepository;
import com.tigris.springk8sdeployment.exception.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService{

    private final OrderRepository orderRepository;


    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(int id) {
        return orderRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Order Does not Exist with id " + id));
    }

    @Override
    public Void deleteOrderById(int id) {
       orderRepository.deleteById(id);
       return null;
    }
}
