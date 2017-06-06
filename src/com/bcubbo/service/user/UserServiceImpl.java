package com.bcubbo.service.user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bcubbo.dao.BaseDao;
import com.bcubbo.dao.user.UserDao;
import com.bcubbo.dao.user.UserDaoImpl;
import com.bcubbo.pojo.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public UserServiceImpl(){
		
		userDao = new UserDaoImpl();
		
		
	};
	public boolean add(User user) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		UserDao  userDao = new UserDaoImpl();
		int updateRows = 0;
		boolean result = false;
		//多态，父类类型引用子类对象
		try {
			connection  = BaseDao.getConnection();
			//获取单例模式链接
			connection.setAutoCommit(false);
			
			
			user.setUserCode("userCode2");
			user.setUserName("用户2");
			
			updateRows = userDao.add(connection,user);

			connection.commit();
			//commit块不要写错位置
			//超级封装
			if(updateRows>0){
				
				System.out.println(">>>>>>>>add success!");
				result =true;
				
			}else{
				
				System.out.println("<<<<<<<<add failed!");
				
				
				
			};
			
			//获取链接
			
			
		} catch (Exception e) {
			e.printStackTrace();
			try{
				System.out.println("出现错误进行了回滚");
				connection.rollback();
				System.out.println("成功回滚");
				
			
			
			}catch(Exception e1){
				e1.printStackTrace();
			};
		}finally{
			//未完成的代码块，还需要添加preparedStatment的关闭方法,已经添加
			BaseDao.closeResource(connection, null, null);
			//参数也可以传null
			
			
		};
		
		
		//
		
		
		
		
		
	
		
		
		
		return result;
	}

}
