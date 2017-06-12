package com.bcubbo.service.user;

import java.util.List;

import com.bcubbo.pojo.User;

public interface UserService {
	/**
	 * 增加用户信息
	 * @param user
	 * @return
	 * 
	 * 
	 * 
	 */
	
	public boolean add(User user);
	
	/**
	 *用户登陆
	 *@param userCode
	 *@param userPassword
	 *@return  User
	 */
	public User login(String userCode,String userPassword);
	/**
	 * 查询用户列表
	 * @param queryUserName
	 * @return  List<User>
	 * 
	 */
	public List<User> getUserList(String queryUserName);
	
	
	/**
	 *查询是否存在userCode
	 *@param userCode
	 *@return User
	 * 
	 * 
	 * 
	 */
	
	public User selectUserCodeExist(String userCode);
	
	/**
	 * 
	 *删除用户 
	 * @param delId
	 * @return int
	 * 
	 * 
	 */
	
	public boolean deleteUser(int delId);
	
	
	
}
