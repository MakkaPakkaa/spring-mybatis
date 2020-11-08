package com.hry.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hry.pojo.User;
import com.hry.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class UserTest {
	@Autowired
	private UserService us;
	
	@Test
	public void testAdd() {
		User user = new User();
		user.setUsername("HHH");
		user.setPassword("123456");
		us.addUser(user);
		System.out.println(user);
	}
	
	@Test
	public void testDel() {
		us.delUserById(15);
	}
	
	@Test
	public void testUpd() {
		User user = new User();
		user.setId(2);
		user.setUsername("HHH");
		user.setPassword("123456");
		user.setEmail("123333@163.com");
		
		us.updUser(user);
	}
	
	@Test
	public void testselect() {
		User user = new User();
		user.setUsername("HHH");
		List<User> list = us.selectUsers(user);
		for(User i :list) {
			System.out.println(i);
		}
	}
	@Test
	public void testId() {
		
		User user = us.selectUserById(17);
		System.out.println(user);
	}
}
