package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO jparvath This type ...
 *
 */
public class Main {

  private static AbstractApplicationContext context1;

  /**
   * @param args
   */
  public static void main(String[] args) {

  }
   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

   HelloBean helloBean = (HelloBean) context1.getBean("HelloBean");

   hellobean.sayHello();
  }