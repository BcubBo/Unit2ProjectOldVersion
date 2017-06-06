package com.bcubbo.dao.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.bcubbo.dao.BaseDao;
import com.bcubbo.dao.ConfigManager;
import com.bcubbo.pojo.User;

public class UserDao2 {

	int updateRows = 0;
	public int add(){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		UserDao  userDao = new UserDaoImpl();
		//多态，父类类型引用子类对象
		try {
			connection  = BaseDao.getConnection();
			//获取单例模式链接
			connection.setAutoCommit(false);
			
			User user = new User();
			user.setUserCode("userCode2");
			user.setUserName("用户2");
			
			updateRows = userDao.add(connection,user);
/*			//开启jdbc的事务管理，设置自动提交为false
			//userDao.add();
			String sql = "insert into smbms_user (userCode,userName) values(?,?)";
			
			Object[] params = {"1001","userName2"};
			updateRows = BaseDao.executeSql(connection, preparedStatement, sql, params);
			
			//providerDao.add();第二张表
			String sql2 = "insert into smbms_provider(proCode,proName)values(?,?)";
			Object[] params2 = {"2001","productName"};
			updateRows = BaseDao.executeSql(connection, preparedStatement, sql2, params2);*/
		
			connection.commit();
			//commit块不要写错位置
			//超级封装
			if(updateRows>0){
				
				System.out.println(">>>>>>>>add success!");
				
			}else{
				
				System.out.println("<<<<<<<<add failed!");
				
				
			};
			
			//获取链接
			
			
		} catch (Exception e) {
			e.printStackTrace();
			try{
				System.out.println("出现错误进行了回滚");
				//connection.rollback();
				System.out.println("成功回滚");
			
			
			}catch(Exception e1){
				e1.printStackTrace();
			};
		}finally{
			//未完成的代码块，还需要添加preparedStatment的关闭方法
			BaseDao.closeResource(connection, preparedStatement, null);
			//参数也可以传null
			
			
		};
		
		
		//
		
		
		
		
		return updateRows ;
		
	};
	
	public static void main(String []args){
		//测试main函数
		System.out.println(new UserDao2().add());
		
		
		
	}
	
	
}
