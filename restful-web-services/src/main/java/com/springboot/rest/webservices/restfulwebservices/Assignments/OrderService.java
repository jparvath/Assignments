package com.springboot.rest.webservices.restfulwebservices.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

	 private static int IdCount=0;
	    private static List<OrderDetails> order=new ArrayList<>();
	    static {
	        order.add(new OrderDetails(++IdCount,"IPhone",75000.0));
	        order.add(new OrderDetails(++IdCount,"Laptop",65000.0));
	        order.add(new OrderDetails(++IdCount,"Car",350000.0));
	    }
	    public List<OrderDetails> findAll(){
	        return order;
	    }
	    public OrderDetails saves(OrderDetails ord1) {
	        ord1.setOrderId(++IdCount);
	        order.add(ord1);
	        return ord1;
         }
	    
	    public OrderDetails findOne(int id) {
	        Predicate<? super OrderDetails> predicate=order->order.getOrderId().equals(id);
	        return order.stream().filter(predicate).findFirst().get();
	    }
	    
	    public void deleteById(int id) {
	        Predicate<? super OrderDetails> predicate=e->e.getOrderId().equals(id);
	        order.removeIf(predicate);
	    }

    }


