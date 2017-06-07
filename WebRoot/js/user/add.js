





var userCode = null;
var userName = null;
var userPassword = null;
var ruserPassword = null;
var phone  = null;
var bornDate = null;
var addBtn = null;


$(document).ready(function(){
	
	userCode = $("#userCode");
	userName = $("#userName");
	userPassword = $("#userPassword");
	ruserPassword = $("#ruserPassword");
	phone = $("#phone");
	bornDate = $("#bornDate");
	addBtn = $("#add");
	
	
	
	//初始化的时候，要把所有的提示信息变为：*以提示必填项更灵活，不要写在页面上
	userCode.next().html("*");
	userName.next().html("*");
	userPassword.next().html("*");
	ruserPassword.next().html("*");
	phone.next().html("*");
	bornDate.next().html("*");
	/**
	 *验证 
	 *失焦\获取焦点
	 *jquery的方法传递
	 */
	userCode.bind("blur",function(){
		//ajax后台验证--userCode是否已存在
		//user.do?userCode=**&method=exists
		$.ajax({
			
			type:"GET",//请求类型
			url:path+"/user.do",//请求的url
			data:{method:"ucexist",userCode:userCode.val()},//请求参数
			dataType:"json",//ajax接口（请求的url）返回的数据类型
			success:function(data){
				
				if(data.userCode == "exist"){//账号已存在,提示错误
					validateTip(userCode.next(),{"color":"red"},imgNo+" 该账号已存在",false);
				}else{//账号可用，正确的提示
					validateTip(userCode.next(),{"color":"yellowgreen"},imgYes+" 该账号可用",true);
				}
			},//data：返回的数据（JSON对象)
			error:function(data){
				
				validateTip(userCode.next(),{"color":"red"},imgNo+" 您访问的页面不存在",false);
				
			}//当访问的时候404，500等非200的错误状态码时会进入error回掉函数中
			
		});
		//此账户可用
		//不可用
		
	}).bind("focus",function(){
		//显示友情提示
		validateTip(userCode.next(),{"color":"#666666"},"* 此项为你登陆系统的账号",false);
		
		
		
		
	}).focus();
	//////
	
	userName.bind("focus",function(){
		
		validateTip(userName.next(),{"color":"#666666"},"* 用户名必须是大于3小于10的字符",false);
		
	}).bind("blur",function(){
		
		if(userName.val()!=null && userName.val().length>3 && userName.val().length<10){
			
			validateTip(userName.next(),{"color":"yellowgreen"},imgYes,true);
			
		}else{
			
			validateTip(userName.next(),{"color":"red"},imgNo+" 用户名输入的不符合规范，请重新输入",false);
		};
		
	})
	/////
	userPassword.bind("focus",function(){
		
		validateTip(userPassword.next(),{"color":"#666666"},"* 密码长度必须是大于6小于20",false);
		
	}).bind("blur",function(){
		
		if(userPassword.val()!=null && userPassword.val().length>6 && userPassword.val().length<10){
			
			validateTip(userPassword.next(),{"color":"yellowgreen"},imgYes,true);
		}else{
			
			validateTip(userPassword.next(),{"color":"red"},imgNo+" 密码输入不符合规范，请重新输入",false);
			
			
		}
		
		
		
	});
	//////
	
	ruserPassword.bind("focus",function(){
		
		validateTip(ruserPassword.next(),{"color":"#666666"},"* 请输入与上边一致的密码",false);
		
	}).bind("blur",function(){
		
		if(ruserPassword.val()!=null && ruserPassword.val().length >6 && ruserPassword.val().length<20 && ruserPassword.val() == ruserPassword.val()){
			
			validateTip(ruserPassword.next(),{"color":"yellowgreen"},imgYes,true);
			
			
			
		}else{
			
			validateTip(ruserPassword.next(),{"color":"red"},imgNo+" 两次输入密码不一致，请重新输入",false);
			
		}
		
	});
	
	
	
})