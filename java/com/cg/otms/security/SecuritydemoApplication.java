package com.cg.otms.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.otms.dto.CreateAdminRequest;
import com.cg.otms.service.IAdminService;

@SpringBootApplication
public class SecuritydemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SecuritydemoApplication.class, args);
		IAdminService service = context.getBean(IAdminService.class);
		CreateAdminRequest request = new CreateAdminRequest();
		request.setFirstName("OnlineTest");
		request.setLastName("System");
		request.setUsername("otms");
		request.setPassword("otms123");
		service.add(request);// default admin

	}

}
