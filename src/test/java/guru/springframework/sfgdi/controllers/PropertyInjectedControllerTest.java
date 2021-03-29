package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.PropertyGreetingService;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new PropertyGreetingService();
	}
	
	
	@Test
	void testSayHello() {
		assertEquals(controller.sayHello(),"greeting from my property service");
		System.out.println(controller.sayHello());
	}

}
