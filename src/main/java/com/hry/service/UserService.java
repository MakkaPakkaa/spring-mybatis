package com.hry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hry.mapper.UserMapper;
import com.hry.pojo.User;

/**
 * 业务逻辑层
 * @author Administrator
 *
 */
@Service
public class UserService {
	@Autowired
	private UserMapper um;
	
	public void addUser(User user){
		um.addUser(user);
	}
	
	public void updUser(User user){
		um.updUser(user);
	}
	
	public void delUserById(Integer Id){
		um.delUserById(Id);
	}
	
	public List<User> selectUsers(User user){
		return um.selectUsers(user);
	}
	
	public User selectUserById(Integer Id){
		return um.selectUserById(Id);
	}
}
