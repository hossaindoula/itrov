package com.itrovers.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

import com.itrovers.domain.User;

/**
 * This class acts as a bridge between AuthenticationController and AuthorizationToken  
 *
 */
public class AuthorizationFilter {
	
	private String username;
	private String password;
	
	public static AuthorizationToken setAuthorization(User user) {

		// Instatiates AuthorizationToken with the username and password
        // which in in turn set the 
        AuthorizationToken userAuthTokenObject = new AuthorizationToken(user);
         
        return userAuthTokenObject;
    }
    
}
