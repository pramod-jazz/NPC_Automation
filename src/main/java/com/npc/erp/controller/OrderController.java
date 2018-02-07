package com.npc.erp.controller;

import com.npc.erp.model.Order;
import com.npc.erp.repo.OrderRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    private List<Order> orders;

    private OrderRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Order> getOrders() {

        repository.f

        return buildOrders();
    }


    List<Order> buildOrders() {
        List<Order> orders = new ArrayList<>();
        Order order1 = buildOrder(1,"million dollar order ", "some descr 2 ", "work on time 2");

        Order order2 = buildOrder(2,"Billion dollar order ", "some descr", "work on time");
        orders.add(order1);
        orders.add(order2);

        return orders;

    }

    Order buildOrder(Integer id, String name, String description,  String additionalRequirements) {
        Order order = new Order();
        order.setId(id);
        order.setName(name);
        order.setAdditionalRequirements(additionalRequirements);
        order.setDescription(description);


      /*  user.setId(id);
        user.setFirstName(fname);
        user.setLastName(lname);
        user.setEmail(email);*/
        return order;
    }

}
