package com.itrovers.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.wings4.security.AuthorizationToken;
import com.wings4.security.model.Feature;
import com.wings4.security.model.Authority;
import com.wings4.security.model.AuthorizedGroups;
import com.wings4.security.model.User;
import com.wings4.security.model.Component;

public interface AuthenticationAndAuthorizationService {
	
	public boolean authenticate(String username, String password);
	
	public boolean checkAuthorization(List<Feature> features, String controller, String operation);
	
	public boolean authorizedGroupsAssignmentToUser(User user, List<AuthorizedGroups> authorizedGroups);
	
	public boolean authorityAssignmentToAuthorizedGroups(AuthorizedGroups authorizedGroups, List<Authority> authorities);
	
	public boolean aspectAssignmentToAuthority(Authority authority, List<Feature> features);
	
	

}
