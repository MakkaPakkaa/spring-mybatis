package com.hry.mapper;

import java.util.List;


import com.hry.pojo.User;



public interface UserMapper {
	//添加
	void addUser(User user);
	//修改
	void updUser(User user) ;
	//删除
	void delUserById(Integer Id);
	//查询多个
	List<User> selectUsers(User user);
	//查询单个
	User selectUserById(Integer Id);
	
	
	

}
