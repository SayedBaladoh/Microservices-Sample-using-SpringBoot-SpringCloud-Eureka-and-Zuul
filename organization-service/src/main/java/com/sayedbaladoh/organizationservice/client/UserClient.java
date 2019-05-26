package com.sayedbaladoh.organizationservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sayedbaladoh.organizationservice.model.User;

@FeignClient(name = "user-service")
public interface UserClient {

	@GetMapping("/organization/{organizationId}")
	List<User> findByOganizationId(@PathVariable("organizationId") Long organizationId);

}
