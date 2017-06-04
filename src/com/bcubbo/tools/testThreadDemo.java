package com.bcubbo.tools;

public class testThreadDemo {
	
	public static void main(String[] args){
		
		
	//for：主线程（获取cpu资源之后，瞬间生成n个子线程，n个并发）
	for(int i = 0 ;i<4;i++){
		//new 开辟子线程start 调用run，运行子线程	
		new ThreadDemo("thread:<"+(i+22130)+">").start();//start调用run
				
				
				
			}
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	for(int i = 0 ;i<4;i++){
		//new 开辟子线程start 调用run，运行子线程	
		new ThreadDemo("thread:<"+(i+32130)+">").start();//start调用run
				
				
				
			}
	}
	
		
	
	
	
	
	
}
