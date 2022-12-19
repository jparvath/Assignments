package com.springboot.rest.webservices.restfulwebservices.Assignments;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Predicate;

    import org.springframework.stereotype.Component;

    @Component
	public class CustomerData {
	    private static List<Customer> cus = new ArrayList<>();

	    private static int cuscount =0;
	static
	{
	   cus.add(new Customer(++cuscount,"Parvathi","Parvathagiri","7075823702"));
	   cus.add(new Customer(++cuscount,"Jamuna","Hanamkonda","9014684977"));
	   cus.add(new Customer(++cuscount,"Suresh","Warangal","918213481"));
	}
	public List<Customer> findAll()
	{
	   return cus;
	}
	public Customer save(Customer user)
	{
	    user.setCustomerId(++cuscount);
	    cus.add(user);
	    return user;
	}
	public Customer findOnecus(int id) {
	    // TODO Auto-generated method stub



	   Predicate<? super Customer> predicate=cus->cus.getCustomerId().equals(id);
	    return cus.stream().filter(predicate).findFirst().orElse(null);



	}
	public void deleteOnecus(int id) {
	    // TODO Auto-generated method stub
	     Predicate<? super Customer> predicate=cus->cus.getCustomerId().equals(id);
	     //return emp.stream().filter(predicate).findFirst().orElse(null);
	     cus.removeIf(predicate);
     }

  }




