package com.bcubbo.dao.provider;

import java.sql.Connection;

import com.bcubbo.pojo.Provider;

/**
 *供应商Dao层 
 * 
 * 
 * 
 */



public interface ProviderDao {
	public boolean add(Connection connection ,Provider provider)throws Exception;
	/**
	 * 
	 *增加供应商
	 *@param connection
	 *@param provider
	 *@return boolean 
	 *@throws Exception
	 * 
	 * 
	 * 
	 */
	//public List<Provider> getProviderList(Connection connection,String
	
	
	public boolean deleteProviderById(Connection connection ,String delId)throws Exception ;
	/**
	 *通过prividerId删除Provider
	 *@param delId
	 *@return
	 *@throws Exception  
	 * 
	 * 
	 * 
	 */
	
	public boolean modify(Connection conneciton ,Provider provider)throws Exception;
	/**
	 *修改用户信息 
	 * @param connection
	 * @param user
	 * @return boolean
	 * @throws Exception
	 * 
	 */
	
	
	
	
	
}
