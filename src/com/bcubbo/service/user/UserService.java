package com.bcubbo.service.user;

import com.bcubbo.pojo.User;

public interface UserService {
	
	public boolean add(User user);
	
	
	public User login(String userCode,String userPassword);

}
