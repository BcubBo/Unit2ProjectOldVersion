package com.bcubbo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.bcubbo.pojo.User;
import com.bcubbo.service.user.UserService;
import com.bcubbo.service.user.UserServiceImpl;
import com.bcubbo.tools.Constants;
import com.mysql.jdbc.StringUtils;



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
		String method = request.getParameter("method");
		
		System.out.println("method>>>>>>>>"+method);
		if(method != null && method.equals("add")){
			
			//增加操作
			System.out.println(">>>>>>>>>增加方法块中add()||user.do中<<<<<<<<<if语句中");
			this.add(request, response);
			
			
		}else if(method != null && method.equals("query")){
			
			this.query(request,response);
			//本地私有query方法
			
			
		}else if(method!=null && method.equals("ucexist")){
			
			this.userCodeExist(request,response);
			
		}else if(method!=null && method.equals(("deleteUser"))){
			
			this.deleteUser(request,response);
			
			
			
		}else if(method!=null && method.equals("view")){
			
			this.getUserById(request, response,"jsp/userview.jsp");

		}else if(method!=null && method.equals("modify")){
			
			this.getUserById(request,response,"jsp/usermodify.jsp");
		}
		
		
		
		
	}//进行判断
	
	
	private void query(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
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
	};

	
	private void add(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		//增加操作
		System.out.println(">>>>>>>>>增加方法块中add()||user.do中<<<<<<<<<add()方法块语句中");
		
		String userCode = request.getParameter("userCode");
		String userName = request.getParameter("userName");		
		String userPassword = request.getParameter("userPassword");		
		int gender = Integer.parseInt(request.getParameter("gender"));
		String bornDate = request.getParameter("bornDate");		
		String phone = request.getParameter("phone");		
		String address = request.getParameter("address");		
		String userType = request.getParameter("userType");	
		
		User user = new User();
		user.setUserCode(userCode);
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setGender(gender);
		user.setPhone(phone);
		try {
			user.setBornDate(new SimpleDateFormat("yyyy-MM-dd").parse(bornDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		user.setAddress(address);
		user.setUserType(Integer.valueOf(userType));
		user.setCreationDate(new Date());
		user.setCreateBy(((User)request.getSession().getAttribute(Constants.USER_SESSION)).getId());
		//强制类型转换
		UserService userService = new UserServiceImpl();
		if(userService.add(user)){
			
			request.getRequestDispatcher("/user.do?method=query").forward(request,response);
			//请求一次，因为新增了信息
			
			
		}else{
			
			request.getRequestDispatcher("html/userAdd.jsp").forward(request, response);
			
			
		}
		
		

	};
	
	private void userCodeExist(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		//判断用户账号是否可用
		String userCode = request.getParameter("userCode");
		
		HashMap<String,String> resultMap = new HashMap<String,String>();
		//HashMap存储json数据
		if(StringUtils.isNullOrEmpty(userCode)){
			
			//UserCode == null || userCode.equals("")
			resultMap.put("userCode", "exist");
	
		}else{
			
			UserService userService  = new UserServiceImpl();
			
			User user = userService.selectUserCodeExist(userCode);
			
			if(null != user){
				//不等空时
				resultMap.put("userCode", "exist");
				
			}else{
				//等空时
				
				resultMap.put("userCode", "notexist");
			}
			
			
		};
		/**
		 * 
		 *把resultMap转为json字符串以json的形式输出 
		 * 
		 * 
		 * 
		 * 
		 */
		response.setContentType("application/json");//配置上下文的输出类型
		//从response对象中获取往外输出的write对象
		PrintWriter outPrintWriter = response.getWriter();
		//把resultMap转为json字符串输出
		outPrintWriter.write(JSONArray.toJSONString(resultMap));
		
		outPrintWriter.flush();
		
		outPrintWriter.close();
		
	};
	
private void deleteUser(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		String id = request.getParameter("uid");
		Integer delId = 0;
		
		try{
			
			delId  = Integer.parseInt(id);
			
			
		}catch(Exception e){
			
			delId = 0;
			
			//e.printStackTrace();
		}
		HashMap<String,String> resultMap = new HashMap<String,String>();
		if(delId<=0){
			
			resultMap.put("delResult", "notexist");
			
			
		}else{
			
			UserService userService = new UserServiceImpl();
			if(userService.deleteUser(delId)){
				
				resultMap.put("deleteResult", "true");
				
				
			}else{
				
				resultMap.put("deleteResult","false");
				
			}
			
			
		}
		
		//把resultMap转换成json对象输出
		response.setContentType("application/json");
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.write(JSONArray.toJSONString(resultMap));
		outPrintWriter.flush();
		outPrintWriter.close();
		resultMap.clear();
		
		
	}
	
	private void getUserById(HttpServletRequest request, HttpServletResponse response,String url)throws ServletException, IOException{
		
		//根据id获取信息
		String id =request.getParameter("uid");
		if(!StringUtils.isNullOrEmpty(id)){
			
			//调用后台方法得到user对象
			UserService userService =  new UserServiceImpl();
			
			 List<User> user  = userService.getUserList(id);
			 
			 request.setAttribute("user",user);
			 //此为list
			 request.getRequestDispatcher(url).forward(request,response);
			
			
		}
		
		
	}
	
	
}
