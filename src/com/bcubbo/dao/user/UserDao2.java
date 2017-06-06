package com.bcubbo.dao.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.bcubbo.dao.BaseDao;
import com.bcubbo.dao.ConfigManager;

public class UserDao2 {
	public Connection connection;
	public PreparedStatement preparedStatement;
	int updateRows = 0;
	public int add(){
		
		
		
		try {
			connection  = BaseDao.getConnection();
			connection.setAutoCommit(false);
			//开启jdbc的事务管理，设置自动提交为false
			//userDao.add();
			String sql = "insert into smbms_user (userCode,userName) values(?,?)";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1,"1001");
			preparedStatement.setString(2,"userName2");
			updateRows = preparedStatement.executeUpdate();
			//providerDao.add();第二张表
			String sql2 = "insert into smbms_provider(proCode,proName)values(?,?)";
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.setString(1, "2001");
			preparedStatement.setString(2, "productName");
		
			updateRows = preparedStatement.executeUpdate();
			connection.commit();
			//commit块不要写错位置
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
			
			try{
				
				preparedStatement.close();
				//connection.close();
				
				
			}catch(Exception e){
	
				e.printStackTrace();
			}
			
		};
		
		
		//
		
		
		
		
		return updateRows ;
		
	};
	
	public static void main(String []args){
		//测试main函数
		System.out.println(new UserDao2().add());
		
		
		
	}
	
	
}
