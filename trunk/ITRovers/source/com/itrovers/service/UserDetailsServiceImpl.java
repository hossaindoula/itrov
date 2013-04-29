/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itrovers.service;

import com.itrovers.dao.UserDao;


import com.itrovers.domain.AuthorizedGroups;
import com.itrovers.domain.Token;
import com.itrovers.domain.User;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ronnie
 */
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;

	@Override
    public User getUser(int userID) {
		return userDao.get(userID);
    }

    @Override
    public User getUserByEmail(String emailAddress) {
    	return userDao.getUserByEmail(emailAddress);
    }

    @Override
    public boolean saveUser(Token token) {
        userDao.save(token);
        User user = new User();
        user.setToken(token);
        user.setActive(true);
        userDao.save(user);

        return true;
    }

    @Override
    public boolean saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public boolean updateToken(Token token) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean updateToken(User user) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User findByUserCodeAndPassword(String username, String password) {
    	return userDao.get(username, password);
    }

    @Override
    public List<User> getAllUsers() {
    	return userDao.getAllUsers();
    }


    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException, DataAccessException {
    	return null;
    }

	@Override
	public User findUserByUserCode(String userCode) {
		return userDao.get(userCode);
	}

	@Override
	public AuthorizedGroups findByAuthorizedGroupsName(
			String authorizedGroupsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveAuthorizedGroups(AuthorizedGroups authorizedGroups) {
		// TODO Auto-generated method stub
		return false;
	}

    @Override
    public int count(){
        return userDao.count();
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return userDao.get(username,password);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.get(username);
    }


}
