package com.itrovers.dao;

import java.util.List;

import com.itrovers.domain.Feature;
import com.itrovers.domain.Authority;
import com.itrovers.domain.AuthorizedGroups;
import com.itrovers.domain.User;
import com.itrovers.domain.Component;

public interface AuthenticationAndAuthorizationDao {

	public boolean authorizedGroupsAssignmentToUser(User user, List<AuthorizedGroups> authorizedGroups);
	
	public boolean authorityAssignmentToAuthorizedGroups(AuthorizedGroups authorizedGroups, List<Authority> authorities);
	
	public boolean featureAssignmentToAuthority(Authority authority, List<Feature> features);

}
