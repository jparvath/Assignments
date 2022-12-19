package com.springboot.rest.webservices.restfulwebservices.Assignments;

	import java.util.HashMap;
	import java.util.Map;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class ZipcodeController {

		@GetMapping("/zipcode")
		public Address getAddressByZipcode(@PathVariable("zipcode") int zipcode) {
			Map<Integer, Address> address = new HashMap<>();
			address.put(600079, new Address("Chennai", "TamilNadu", "India"));
			address.put(560103, new Address("Bangalore", "Karnataka", "India"));
			address.put(621001, new Address("Kumbakonam","TamilNadu", "India"));
			address.put( 191203, new Address("Srinagar","Kasmir", "India"));

			return address.get(zipcode);

		}
	}



