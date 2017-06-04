package com.bcubbo.tools;

public class ThreadDemo extends Thread {
	
	private String threadNo;
	
	public ThreadDemo(String _threadNo){
		
		this.threadNo = _threadNo;
	};
	public String getThreadNo() {
		return threadNo;
	}
	public void setThreadNo(String threadNo) {
		this.threadNo = threadNo;
	}
	public void run() {
		
		//线程开始执行
		
		
		
		super.run();
		System.out.println("run运行==========:<"+threadNo+">");
		//Singleton.getInstance(threadNo);
	}
	
	
	
}
