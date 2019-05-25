package com.sayedbaladoh.organizationservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sayedbaladoh.organizationservice.model.Site;

@FeignClient(name = "site-service")
public interface SiteClient {

	@GetMapping("/sites/organization/{organizationId}")
	public List<Site> findByOrganization(@PathVariable("organizationId") Long organizationId);

	@GetMapping("/sites/organization/{organizationId}/with-employees")
	public List<Site> findByOrganizationWithEmployees(@PathVariable("organizationId") Long organizationId);

}
