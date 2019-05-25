package com.sayedbaladoh.siteservice.model;

/**
 * User Entity
 * 
 * @author SayedBaladoh
 *
 */
public class User {

	private Long id;

	private Long organizationId;

	private Long siteId;

	private String name;
	private String email;
	private String phone;
	private String position;

	public User() {

	}

	public User(Long organizationId, Long siteId, String name, String email, String phone, String position) {
		this.organizationId = organizationId;
		this.siteId = siteId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.position = position;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public Long getSiteId() {
		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", organizationId=" + organizationId + ", siteId=" + siteId + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", position=" + position + "]";
	}

}
