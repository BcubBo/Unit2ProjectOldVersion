package com.bcubbo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.bcubbo.dao.ConfigManager;

/**
 * 
 * 操作数据库的基类--静态类，静态是非全局唯一，
 * 单例模式是唯一存在的。
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class BaseDao {
	
	public static Connection getConnection(){
		//获取链接
		Connection connection = null;
		String driver,url,user,password;
		ConfigManager conManInstance = ConfigManager.getInstance();
		//获取实例
		driver = conManInstance.getValue("driver");
		url = conManInstance.getValue("url");
		user = conManInstance.getValue("user");
		password = conManInstance.getValue("password");
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
		
		
		
		
	};
	
	public static boolean closeResource(Connection connection ,PreparedStatement preparedStatement){
		
		
		
		return false;
		
	};
	
	
}
