package com.tigris.springk8sdeployment.repo;

import com.tigris.springk8sdeployment.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {


}
