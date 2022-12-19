package com.springboot.rest.webservices.restfulwebservices.Assignments;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	 private OrderService service;
	    public OrderController(OrderService service) {
	        this.service=service;
	    }

	    @GetMapping("/orderdetails")
	    public List<OrderDetails> retrieveAllUser(){
	        return service.findAll();
        }

	    @GetMapping("/orderdetails/{id}")
	    public OrderDetails findOne(@PathVariable int id) {
	        return service.findOne(id);
	    }

	    @PostMapping("/orderdetails")
	    public OrderDetails createOrder(@RequestBody OrderDetails ord2) {
	        return service.saves(ord2);
         }

	    @DeleteMapping("/orderdetails/{id}")
	    public void deleteorderDetails(@PathVariable int id) {
	        service.deleteById(id);
	    }

	}


