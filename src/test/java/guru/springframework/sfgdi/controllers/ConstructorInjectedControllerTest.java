package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;
	
	@BeforeEach
	void setup() {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	void testSayHello() {
		assertEquals(controller.sayHello(),"greeting from my service");
		System.out.println(controller.sayHello());
	}

}
