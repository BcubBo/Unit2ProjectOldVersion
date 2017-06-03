package com.bcubbo.tools;

public class Singleton {

	private static Singleton singleton;
	
	static{
		
		
		singleton = new Singleton();
		
		
		//静态代码块在类启动的时候直接加载
	}
	
	private Singleton(){};
	
	public static Singleton getInstance(){
		
		
		return singleton;
		
		
		
	};
	
	
	
}
