package com.bcubbo.dao;

import java.io.InputStream;
import java.util.Properties;

//读取配置文件的工具类---单例模式
public class ConfigManager {
	
	
	//private static ConfigManager configManager;
	//懒汉模式
	private static ConfigManager configManager = new ConfigManager();
	//饿汉模式，类加载的时候就完成初始化
	private static Properties properties;
	
	private ConfigManager(){
		String configFile = "database.properties";
		properties = new Properties();
		try{
			InputStream is = ConfigManager.class.getClassLoader().getResourceAsStream(configFile);
			properties.load(is);
			is.close();
			
		}catch(
				Exception  e
				
				
				){
			
			e.printStackTrace();
		};
		
		
		
	};//单例构造器
	
	/*
	 * 线程不安全，在并发环境下，很有可能会出现多个configManager实例
	 * 需要考虑同步
	 * 添加同步锁，synchronized（懒汉模式）
	 * (饿汉模式)
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
	
	public static synchronized ConfigManager getInstance(){
		
/*		if(configManager==null){
			
			configManager = new ConfigManager();
		}
		
		
		return configManager;
		//懒汉模式
		*/
		return configManager;
		//饿汉模式
		
	};
	
	public String getValue(String key){
		
		
		return properties.getProperty(key);
		//返回所要获取的值
	};
	
	
}
