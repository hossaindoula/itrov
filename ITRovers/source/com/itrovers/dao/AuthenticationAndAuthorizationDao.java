package com.itrovers.dao;

import java.util.List;

import com.wings4.security.model.Feature;
import com.wings4.security.model.Authority;
import com.wings4.security.model.AuthorizedGroups;
import com.wings4.security.model.User;
import com.wings4.security.model.Component;

public interface AuthenticationAndAuthorizationDao {

	public boolean authorizedGroupsAssignmentToUser(User user, List<AuthorizedGroups> authorizedGroups);
	
	public boolean authorityAssignmentToAuthorizedGroups(AuthorizedGroups authorizedGroups, List<Authority> authorities);
	
	public boolean featureAssignmentToAuthority(Authority authority, List<Feature> features);

}
