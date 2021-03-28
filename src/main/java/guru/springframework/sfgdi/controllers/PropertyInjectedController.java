package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingService greetingService;
	
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
