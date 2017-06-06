package com.bcubbo.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bcubbo.dao.BaseDao;
import com.bcubbo.pojo.User;

public class UserDaoImpl implements UserDao{
	
	public int add(Connection connection, User user) throws Exception {
		int updateRows=0;
		PreparedStatement preparedStatement=null;
		String sql = "insert into smbms_user(userCode,userName) values(?,?)";
		
		Object [] params = {user.getUserCode(),user.getUserName()};
		
		updateRows = BaseDao.executeSql(connection, preparedStatement, sql, params);
		BaseDao.closeResource(null, preparedStatement, null);
		
		
		
		
		
		return updateRows;
		//添加方法
	}

}
