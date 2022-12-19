package com.springboot.rest.webservices.restfulwebservices.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
@Component()
public class UserDataStoring {

	private static List<UserDetails> user = new ArrayList<>();
	    static
	  {
	       user.add(new UserDetails(506369,"Parvathagiri","Telangana","India"));
	       user.add(new UserDetails(505234,"Vizag","AndhraPradesh","India"));
	       user.add(new UserDetails(506365,"Warangal","Telangana","India"));

	  }
	  public List<UserDetails> findAll()
	  {
	      return user;
	  }
	  public UserDetails findOne(int id)
	  {
	      Predicate<? super UserDetails> predicate= users->users.getZipcode().equals(id);
	      return user.stream().filter(predicate).findFirst().get();
	  }
	}

