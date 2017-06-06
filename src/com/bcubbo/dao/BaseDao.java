package com.bcubbo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
		/**
		 * 获取链接
		 * 
		 */
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
	
	public static boolean closeResource(Connection connection ,PreparedStatement preparedStatement,ResultSet resultSets){
		boolean flag =true;
		//关闭资源
		if(resultSets != null){
			
			try {
				resultSets.close();
				resultSets = null;//GC回收
				System.out.println("关闭resultSets成功");
			} catch (SQLException e) {
				e.printStackTrace();
				flag = false;
			}
			
			
		}
		if(preparedStatement != null){
			
			try {
				preparedStatement.close();
				preparedStatement = null;//GC回收
				System.out.println("关闭preparedStatement成功");
			} catch (SQLException e) {
				e.printStackTrace();
				flag = false;
			}
			
			
		}
		if(connection != null){
			
			try {
				connection.close();
				connection = null;//GC回收
				System.out.println("关闭connection成功");
			} catch (SQLException e) {
				e.printStackTrace();
				flag = false;
			}
			
			
		}
		
		
		return flag;
		
	};
	
	
	//查询方法
	/**
	 *查询操作
	 *@param conneciton
	 *@param preparedStatement
	 *@param resultSets
	 *@param sql
	 *@param params
	 *@return result
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static ResultSet executeSql (Connection connection,PreparedStatement preparedStatement,ResultSet resultSets,String sql,Object[] params)throws Exception{
		
		
			preparedStatement = connection.prepareStatement(sql);
			for(int i = 0;i<params.length;i++){
				
				preparedStatement.setObject(i+1, params[i]);
				//占位
				
			}
			resultSets=preparedStatement.executeQuery();
		
		
		
		
		
		
		
		return resultSets;
		
		
	};
	/**
	 *更新操作
	 *@param conneciton
	 *@param preparedStatement
	 *
	 *@param sql
	 *@param params
	 *@return int
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static int executeSql(Connection connection ,PreparedStatement preparedStatement,String sql ,Object[] params)throws Exception{
		int updateRows = 0;
		preparedStatement = connection.prepareStatement(sql);
		
		for(int i = 0;i<params.length;i++){
			
			preparedStatement.setObject(i+1,params[i]);
			//占位赋值
			
			
		}
		
		updateRows = preparedStatement.executeUpdate();
		
		
		
		return updateRows;
	};
	
	
	
	
}
