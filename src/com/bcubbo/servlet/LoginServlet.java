package com.bcubbo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcubbo.pojo.User;
import com.bcubbo.service.user.UserService;
import com.bcubbo.service.user.UserServiceImpl;
import com.bcubbo.tools.Constants;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//获取用户名和密码
		String userCode = request.getParameter("userCode");
		System.out.println("userCode=>>>>>>>>>>>>"+userCode);
		
		String userPassword = request.getParameter("userPassword");
		System.out.println("userPassword=>>>>>>>>>>"+userPassword);
		//调用service方法，进行用户匹配
		UserService userService = new UserServiceImpl();
		User user = userService.login(userCode,userPassword);
		if(user!=null){
			
			System.out.println("输出LoginServlet中的user字段中userCode信息>>>>>>"+user.getUserCode());
			
		};

		
		if(null!=user){
			
			//放入session
			request.getSession().setAttribute(Constants.USER_SESSION,user);
			
			
			//页面跳转（frame.jsp)
			
			response.sendRedirect("html/frame.jsp");
		}else{
			//页面跳转(login.jsp)带出提示信息--转发
			request.setAttribute("error","用户名或密码不正确");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		};
				//此未伪代码
		
		doGet(request, response);
	}

}
