package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.SetterGreetingService;

class SetterInjectedControllerTest {
	
	SetterInjectedController controller;

	@BeforeEach
	void setup() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new SetterGreetingService());
	}

	@Test
	void testSayHello() {
		assertEquals(controller.sayHello(),"greeting from my setter service");
		System.out.println(controller.sayHello());
	}

}
