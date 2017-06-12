package com.bcubbo.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bcubbo.dao.BaseDao;
import com.bcubbo.pojo.User;

public class UserDaoImpl implements UserDao{
	
	public int add(Connection connection, User user) throws Exception {
		int updateRows=0;
		if(null!=connection){
			PreparedStatement preparedStatement=null;
			String sql = "insert into smbms_user("
					+ "userCode,"
					+ "userName,"
					+ "userPassword,"
					+ "userType,"
					+ "gender,"
					+ "phone,"
					+ "address,"
					+ "creationDate,"
					+ "createBy,"
					+ "bornDate) "
					+ "values(?,?,?,?,?,?,?,?,?,?)";
			
			Object [] params = {user.getUserCode(),
								user.getUserName(),
								user.getUserPassword(),
								user.getUserType(),
								user.getGender(),
								user.getPhone(),
								user.getAddress(),
								user.getCreationDate(),
								user.getCreateBy(),
								user.getBornDate()
					
			
			
			
			
			
			};
			
			updateRows = BaseDao.executeSql(connection, preparedStatement, sql, params);
			BaseDao.closeResource(null, preparedStatement, null);
		};
		
		//在此关闭preparedStatement因为sql语句已经使用完毕
		
		
		
		
		
		return updateRows;
		//添加方法
	}

	public User getLoginUser(Connection connection, String userCode) throws Exception {
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSets = null;
		User user = null;
		
		if(null!=connection){
			String sql = "select * from smbms_user where userCode=?";
			Object[] params = {userCode};
			resultSets = BaseDao.executeSql(connection, preparedStatement, resultSets, sql, params);
			if(resultSets.next()){
				System.out.println("获取结果集并进入结果集语句段");
				user = new User();
				//获取resultSets之后再进行创建user
				user.setId(resultSets.getInt("id"));
				user.setGender(resultSets.getInt("gender"));
				user.setUserType(resultSets.getInt("userType"));
				user.setCreateBy(resultSets.getInt("createBy"));
				user.setModifyBy(resultSets.getInt("modifyBy"));
				System.out.println("输出userCode从数据库查询结果中>>>>>>"+resultSets.getString("userCode"));
				user.setUserCode(resultSets.getString("userCode"));
				user.setUserName(resultSets.getString("userName"));
				System.out.println("输出userPassword从数据库查询结果中>>>>>>"+resultSets.getString("userPassword"));
				user.setUserPassword(resultSets.getString("userPassword"));
				user.setPhone(resultSets.getString("phone"));
				user.setAddress(resultSets.getString("address"));
				user.setBornDate(resultSets.getTimestamp("bornDate"));
				user.setCreationDate(resultSets.getTimestamp("creationDate"));
				user.setModifyDate(resultSets.getTimestamp("modifyDate"));
				
				
				
				
				
				
				
			};
			
			BaseDao.closeResource(null, preparedStatement, resultSets);
		};
		
		
		if(user!=null){System.out.println("UserDaoImpl中的user的userCode的值为:>>>>>>"+user.getUserCode());
		
		};
		
		return user;
	}

	public List<User> getUserList(Connection connection, String userName) throws Exception {
		
		PreparedStatement preparedStatement = null;
		ResultSet resultSets = null;
		List<User> userList = new ArrayList<User>();
		if(connection != null){
			
			String sql = "select * from smbms_user where userCode like ?";
			Object[] params = {"%"+userName+"%"};
			resultSets = BaseDao.executeSql(connection, preparedStatement, resultSets, sql, params);
			while(resultSets.next()){
				
				User _user = new User();
				_user.setId(resultSets.getInt("id"));
				_user.setUserCode(resultSets.getString("userCode"));
				_user.setUserName(resultSets.getString("userName"));
				_user.setGender(resultSets.getInt("gender"));
				_user.setPhone(resultSets.getString("phone"));
				_user.setBornDate(resultSets.getDate("bornDate"));
				_user.setUserType(resultSets.getInt("userType"));
				
				userList.add(_user);
				
				
				
			}
			
			BaseDao.closeResource(null, preparedStatement, resultSets);
			
		};
		
		return userList;
	}

	
	public int deleteUserList(Connection connection ,int delId) {
		
		int deleteRows = 0;
		
		PreparedStatement preparedStatement = null;
		
		if(connection!=null){
			
			String sql = "delete from smbms_user where id=?";
			Object[] params ={delId};
			try {
				deleteRows = BaseDao.executeSql(connection, preparedStatement,sql, params);
			} catch (Exception e) {
				
				
				
				e.printStackTrace();
			}
			
			
			
		}
		
		
		return deleteRows ;
		
		
		
	}

}
