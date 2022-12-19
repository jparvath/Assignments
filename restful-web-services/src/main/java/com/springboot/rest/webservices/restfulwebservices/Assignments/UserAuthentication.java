package com.springboot.rest.webservices.restfulwebservices.Assignments;

import org.springframework.stereotype.Component;



@Component
public class UserAuthentication {
  private String username="Anitha";
  private String password="ani@123";
  public boolean find(String username1,String password1)
  {
     /* if((username==username1)&&(password==password1))
      {
          return true;
      }
      else
      {
          return false;
      }
  }*/
      return username.equals(username1)&&password.equals(password1);
}
}
