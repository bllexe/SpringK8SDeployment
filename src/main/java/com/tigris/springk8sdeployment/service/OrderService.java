package com.tigris.springk8sdeployment.service;

import com.tigris.springk8sdeployment.entity.Order;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface OrderService {

    Order addOrder(Order order);

    List<Order> getAllOrders();

    Order getOrderById(int id);

    Void deleteOrderById(int id);
}
