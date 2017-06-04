package com.bcubbo.tools;

public class Singleton {

	private static Singleton singleton;
	
	static{
		
		System.out.println("static静态代码块");
		singleton = new Singleton();
		
		
		//静态代码块在类启动的时候直接加载
		//静态代码块方式的饿汉模式
	}
	
	private Singleton(){};
	
	public static Singleton getInstance(){
		
		
		return singleton;
		
		
		//饿汉模式(变种)
	};
	
	public static void test(){
		
		System.out.println("进行是否创建类instance检验:["+singleton.toString()+"]");
		
	};
	
	
	//双重校验锁
	//针对懒汉模式
	
	/*private Singleton(){};
	
	public static Singleton getInstance(String threadNo){
		
		if(singleton == null){
			System.out.println("进入第一层判断:<"+threadNo+">");
			synchronized(Singleton.class){
				if(singleton == null){
					System.out.println("进入第二层判断:<"+threadNo+">");
					singleton  = new Singleton();
				};
			};
			
			singleton = new Singleton();
			System.out.println("进入最外层推出语句:<"+threadNo+">");
		}
		
		return singleton;
	};*/
	
	
	
}
