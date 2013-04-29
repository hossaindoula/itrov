package com.itrovers.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authorized_groups")
public class AuthorizedGroups implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private String authorizationName;
	private String authorizationDescription;
	
	@ManyToMany(mappedBy = "authorizedGroups")
	private List<User> users;

	@ManyToMany
	private List<Authority> authorities;
	
	
	public List<Authority> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthorizationName() {
		return authorizationName;
	}
	public void setAuthorizationName(String authorizationName) {
		this.authorizationName = authorizationName;
	}
	public String getAuthorizationDescription() {
		return authorizationDescription;
	}
	public void setAuthorizationDescription(String authorizationDescription) {
		this.authorizationDescription = authorizationDescription;
	}
	
	

}
