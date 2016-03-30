/**
 * 
 */
package com.geeth.spring.angularjs.service;

import java.util.List;

import com.geeth.spring.angularjs.model.User;

/**
 * @author Geeth
 *
 */
public interface UserService {
    
    User findById(long id);
     
    User findByName(String name);
     
    void saveUser(User user);
     
    void updateUser(User user);
     
    void deleteUserById(long id);
 
    List<User> findAllUsers(); 
     
    void deleteAllUsers();
     
    public boolean isUserExist(User user);
     
}