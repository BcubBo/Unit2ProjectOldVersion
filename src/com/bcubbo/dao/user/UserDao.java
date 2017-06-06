package com.bcubbo.dao.user;

import java.sql.Connection;

import com.bcubbo.pojo.User;

public interface UserDao {
	
	public int add(Connection connection,User user) throws Exception;
	
	
	
	
}
