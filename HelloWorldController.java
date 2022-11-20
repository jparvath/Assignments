package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
  @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
  public String printHello() {

    return "helloWorld";
  }

  @RequestMapping(value = "/index", method = RequestMethod.GET)
  public String sayHello2() {

    return "index";
  }

  @RequestMapping(value = "/index", method = RequestMethod.POST)
  public String sayHello3() {

    return "helloWorld";
  }
}
