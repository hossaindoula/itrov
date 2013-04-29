package com.itrovers.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.itrovers.util.AuthorizationToken;
import com.itrovers.domain.Feature;
import com.itrovers.domain.Authority;
import com.itrovers.domain.AuthorizedGroups;
import com.itrovers.domain.User;
import com.itrovers.domain.Component;

public interface AuthenticationAndAuthorizationService {
	
	public boolean authenticate(String username, String password);
	
	public boolean checkAuthorization(List<Feature> features, String controller, String operation);
	
	public boolean authorizedGroupsAssignmentToUser(User user, List<AuthorizedGroups> authorizedGroups);
	
	public boolean authorityAssignmentToAuthorizedGroups(AuthorizedGroups authorizedGroups, List<Authority> authorities);
	
	public boolean aspectAssignmentToAuthority(Authority authority, List<Feature> features);
	
	

}
