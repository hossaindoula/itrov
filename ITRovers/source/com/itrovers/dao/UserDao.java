package com.itrovers.dao;

import java.util.List;

import com.itrovers.domain.AuthorizedGroups;
import com.itrovers.domain.Token;
import com.itrovers.domain.User;

public interface UserDao {     // query
	
	public boolean save(User user);
    
    public boolean save(Token token);
    
    public boolean update(User user);

    public boolean update(Token token);

	public boolean delete(User user);

    public User get(int userID);

    public User get(String username);

    public User get(String username, String password);
    
    public User getUserByEmail(String email);
    
    public List<User> getAllUsers();
    
    public int count();
    
}
