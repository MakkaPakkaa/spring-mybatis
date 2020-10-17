package com.hry.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hry.pojo.User;
import com.hry.service.UserService;


public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//使用 request.getParameter() 方法来获取表单参数的值
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String sex = request.getParameter("sex");
		String phone = request.getParameter("phone");
		
		System.out.println(username);
		System.out.println(sex);
	
		User user = new User();
		//set方法
		user.setUsername(username);
	    user.setPassword(password);
	    user.setEmail(email);
	    user.setSex(sex);
	    user.setPhone(phone);
	    
	    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
	    UserService userService = (UserService)context.getBean("userService");
	    
	    userService.addUser(user);
	    response.sendRedirect("addsuccess.jsp");
//	    request.getRequestDispatcher("login.jsp").forward(request, response);
     
		
		
	}

}
