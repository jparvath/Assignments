package springsecurity.Assignments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloLogin {

	 @GetMapping("/")
	    public String hello() {
	        return("Hello Welcome to Web page");
	    }
	    @GetMapping("/hello")
	    public String sayhello() {
	        return ("Login to your web application");
	    }
	    @GetMapping("/admin")
	    public String welcome() {
	        return("Hello Welcome admin to Web page");
	    }


}
