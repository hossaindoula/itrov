/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itrovers.service;

import com.wings4.security.model.AuthorizedGroups;
import com.wings4.security.model.Token;
import com.wings4.security.model.User;
import java.util.List;

/**
 *
 * @author ronnie
 */
public interface UserDetailsService{
    
    public User getUser(int userID);

    public User getUserByEmail(String emailAddress);
    
    public boolean saveUser(Token token);
    
    public boolean saveUser(User user);
    
    public boolean updateToken(Token token);
    
    public boolean updateToken(User user);

    public User findByUserCodeAndPassword(String username, String password);       
    
    public List<User> getAllUsers();
    
    public User findUserByUserCode(String userCode);
    
    public AuthorizedGroups findByAuthorizedGroupsName(String authorizedGroupsName);
    
    public boolean saveAuthorizedGroups(AuthorizedGroups authorizedGroups);
    
    public int count();
    
    public User findByUsernameAndPassword(String username, String password);
    
    public User findByUsername(String username);
    
}
