package com.sayedbaladoh.siteservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sayedbaladoh.siteservice.model.User;

@FeignClient(name = "user-service")
public interface UserClient {
	
	@GetMapping("/site/{siteId}")
	List<User> findBySiteId(@PathVariable("siteId") Long siteId);
	
}
