package SpringA1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO jparvath This type ...
 *
 */
public class MainBean {

  /**
   * @param args
   */
  public static void main(String[] args) {

    // TODO Auto-generated method stub
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

    BeanLifeCycle obj = (BeanLifeCycle) context.getBean("beanlifecycle");
    obj.getMessage();
    context.registerShutdownHook();
  }

}
