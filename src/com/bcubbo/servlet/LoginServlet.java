package com.bcubbo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bcubbo.pojo.User;


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
		
		String userPassword = request.getParameter("userPassword");
		
		//调用service方法，进行用户匹配
		//User user = UserService.login(userCode,userPassword);
		
		/*if(null!=user){
			
			//放入session
			
			//页面跳转（frame.jsp)
		}else{
			//页面跳转(login.jsp)带出提示信息--转发
			
		};
				//此未伪代码
*/		
		doGet(request, response);
	}

}
