package com.sayedbaladoh.organizationservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sayedbaladoh.organizationservice.model.Site;

@FeignClient(name = "site-service")
public interface SiteClient {

	@GetMapping("/organization/{organizationId}")
	public List<Site> findByOrganization(@PathVariable("organizationId") Long organizationId);

	@GetMapping("/organization/{organizationId}/with-users")
	public List<Site> findByOrganizationWithUsers(@PathVariable("organizationId") Long organizationId);

}
