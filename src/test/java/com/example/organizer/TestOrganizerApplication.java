package com.example.organizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestOrganizerApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrganizerApplication::main).with(TestOrganizerApplication.class).run(args);
	}

}
