package com.bcubbo.service.user;

import java.util.List;

import com.bcubbo.pojo.User;

public interface UserService {
	
	
	public boolean add(User user);
	/**
	 * 增加用户信息
	 * @param user
	 * @return
	 * 
	 * 
	 * 
	 */
	
	
	public User login(String userCode,String userPassword);
	/**
	 *用户登陆
	 *@param userCode
	 *@param userPassword
	 *@return  User
	 */
	
	public List<User> getUserList(String queryUserName);
	/**
	 * 查询用户列表
	 * @param queryUserName
	 * @return  List<User>
	 * 
	 */
	
	
	public User selectUserCodeExist(String userCode);

	/**
	 *查询是否存在userCode
	 *@param userCode
	 *@return User
	 * 
	 * 
	 * 
	 */
	
	
	public boolean deleteUser(int delId);
	/**
	 * 
	 *删除用户 
	 * @param delId
	 * @return int
	 * 
	 * 
	 */

	public User getUserById(String id);
	/**
	 * 
	 *获取单用户
	 * @param id
	 * @return User
	 * 
	 * 
	 */

	public boolean modify(User user);
	/**
	 *修改用户
	 *@param user
	 *@return 
	 * 
	 */

	public boolean updatePwd(int id ,String pwd);
	/**
	 *修改密码
	 *@param user
	 *@return boolean
	 * 
	 */
	
	
	
	
	
	
	
}
