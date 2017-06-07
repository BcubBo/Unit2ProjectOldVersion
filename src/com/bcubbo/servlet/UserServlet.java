package com.bcubbo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcubbo.pojo.User;
import com.bcubbo.service.user.UserService;
import com.bcubbo.service.user.UserServiceImpl;



public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		doPost(request,response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询用户列表
		String queryUserName = request.getParameter("queryname");
		/**
		 * 
		 * http://localhost:8167/ProjectName/user.do ---queryUserName --null第一种情况
		 * http://localhost:8167/ProjectName/user.do?queryname=""
		 * --queryUserName ---""
		 * 
		 * 
		 * 
		 */
		
		UserService userService = new UserServiceImpl();
		List<User> userList = null;
		userList = userService.getUserList(queryUserName);
		request.setAttribute("userList",userList);
		request.setAttribute("queryUserName", queryUserName);
		request.getRequestDispatcher("html/userList.jsp").forward(request, response);
		
		
	}

}
