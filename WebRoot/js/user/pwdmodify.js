/**
 * 
 */

var oldpassword = null;
var newpassword = null;
var rnewpassword = null;
var saveBtn = null;
$(function(){
	
	oldpassword = $("#oldPassword");
	newpassword = $("#newPassword");
	rnewpassword = $("#rnewPassword");
	saveBtn = $("#save");
	
	oldpassword.next().html("*");
	newpassword.next().html("*");
	rnewpassword.next().html("*");
	
	oldpassword.on("blur",function(){
		
		//ajax异步验证
		$.ajax({
			
			
			type:"GET",
			url:path+"/user.do",
			data:{method:"pwdmodify",oldpassword:oldpassword.val()},
			dataType:"json",
			success:function(data){
				
				//旧密码正确
				if(data.result=="true"){
					
					validateTip(oldpassword.next(),{"color":"yellowgreen"},imgYes,true);
					
					
				}else if(data.result=="false"){
					
					validateTip(oldpassword.next(),{"color":"red"},imgNo+" 旧密码错误",false);
					
					//旧密码不正确
				}else if(data.result =="error"){
					//当前用户session过期，请重新登陆
					validateTip(oldpassword.next(),{"color":"red"},imgNo+" 当前用户session会话已经过期",false);
					
				}
				
				
				
				
				
			},
			error:function(data){
				
				//请求出错
				
				validateTip(oldpassword.next(),{"color":"red"},imgNo+" 请求错误",false);
				
			}
			
			
			
		});////
		
		
		
		
		
	}).on("focus",function(){
		
		
		validateTip(oldpassword.next(),{"color":"#666666"},"* 请输入原密码",false);
		
		
		
		
	});//
	
	//新密码验证
	newpassword.on("foucus",function(){
		validateTip(newpassword.next(),{"color":"#666666"},"* 密码长度必须是大于6小于20",false);
		
		
		
		
		
	}).on("blur",function(){
		if(newpassword.val() != null && newpassword.val().length>6 && newpassword.val().length<20){
			//密码长度验证
			validateTip(newpassword.next(),{"color":"yellowgreen"},imgYes,true);
			
			
			
			
		}else{
			
			validateTip(newpassword.next(),{"color":"red"},imgNo+" 密码输入不符合规范，请重新输入",false);
			
		}
		
		
		
		
		
	});////
	//密码二次验证
	rnewpassword.on("focus", function() {

        validateTip(rnewpassword.next(), { "color": "#666666" }, "* 请输入与上边一致的密码", false);

    }).on("blur", function() {

        if (rnewpassword.val() != null && rnewpassword.val().length > 6 && rnewpassword.val().length < 20 && rnewpassword.val() == rnewpassword.val()) {

            validateTip(rnewpassword.next(), { "color": "yellowgreen" }, imgYes, true);



        } else {

            validateTip(rnewpassword.next(), { "color": "red" }, imgNo + " 两次输入密码不一致，请重新输入", false);

        }

    });
    //////
	saveBtn.on("click",function(){
		
		oldpassword.blur();
		newpassword.blur();
		rnewpassword.blur();
		if(oldpassword.attr("validateStatus")=="true" && newpassword.attr("validateStatus") == "true" && rnewpassword.attr("validateStatus")=="true"){
			
			if(confirm("确定要修改密码？")){
				
				$("#passwordSubmit").submit();
				
				
				
			}
			
			
			
		}
		
		
	});////
	
	
	
	
	
	
});//结尾








///
////////