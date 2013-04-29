package com.itrovers.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.itrovers.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itrovers.util.AuthorizationFilter;
import com.itrovers.dao.UserDao;
import com.itrovers.domain.Feature;
import com.itrovers.domain.Authority;
import com.itrovers.domain.AuthorizedGroups;
import com.itrovers.domain.User;

@Service
public class AuthenticationAndAuthorizationServiceImpl implements
		AuthenticationAndAuthorizationService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean authenticate(String username, String password) {
		// call dao method to retrieve the user object
		User user = userDao.get(username, password);
		
		if(user instanceof User){
			// call authenticationfilter
			AuthorizationFilter.setAuthorization(user);
			
			return true;
		}		
		return false;
	}

	@Override
	public boolean checkAuthorization(List<Feature> features, String controller, String operation) {
        boolean isAllowed = false;
        for(Feature feature : SessionUtil.getSessionUserFeatures()){
            System.out.println("controller " + controller + " feature.getComponent().getComponentName()" + feature.getComponent().getComponentName());
            if(feature.getComponent().getComponentName().equals(controller)
                    && feature.getOperation().equals(operation)){
                isAllowed = true;
                break;
            }
        }
		return isAllowed;
	}

	@Override
	public boolean authorizedGroupsAssignmentToUser(
			User user, List<AuthorizedGroups> authorizedGroups) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean authorityAssignmentToAuthorizedGroups(
			AuthorizedGroups authorizedGroups, List<Authority> authorities) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean aspectAssignmentToAuthority(Authority authority,
			List<Feature> features) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
