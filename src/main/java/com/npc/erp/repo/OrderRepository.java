package com.npc.erp.repo;

import com.npc.erp.model.Order;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order,Integer> {
}
