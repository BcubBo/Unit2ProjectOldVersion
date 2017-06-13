/**
 * 
 */

var userName = null;
var bornDate = null;
var phone = null;
var saveBtn = null;


$(function(){
	
	userName = $("#userName");
	bornDate = $("#bornDate");
	phone = $("#phone");
	saveBtn = $("#saveBtn");
	
	userName.next().html("*");
	bornDate.next().html("*");
	phone.next().html("*");
	
	userName.on("focus",function(){
		
		validateTip(userName.next(),{"color":"#666666"},"* 用户名必须是大于3小于10的字符",false);
		
		if(userName.val() != null && userName.val().length > 3 && userName.val().length<10){
			
			validateTip(userName.next(),{"color":"green"},imgYes,true);
			//
			
			
		}else{
			
			validateTip(userName.next(),{"color":"red"},imgNo+" 用户名输入的不符合规范，请重新输入",false);
			//
			
			
			
		}//
		
		
	}).on("blur",function(){
		
		
		
		
		
		
	});//用户名验证
	
	bornDate.on("focus", function() {
        validateTip(bornDate.next(), { "color": "#666666" }, "* 点击输入框选择日期", false);

    }).on("blur",function() {
        if (bornDate.val() != null && bornDate.val() != "") {
            validateTip(bornDate.next(), { "color": "yellowgreen" }, imgYes, true);


        } else {

            validateTip(bornDate.next(), { "color": "red" }, imgNo + " 选择的日期正确，重新选择", false);



        }


    });
    //////



    phone.on("focus", function() {

        validateTip(phone.next(), { "color": "#666666" }, "* 请输入手机号", false);


    }).on("blur", function() {

        var pattern = /^(13[0-9]{1}|15[0-9]{1}|18[0-9]{1})\d{8}$/;
        if (phone.val().match(pattern)) {

            validateTip(phone.next(), { "color": "yellowgreen" }, imgYes, true);
        } else {

            validateTip(phone.next(), { "color": "red" }, imgNo + " 请输入正确的手机号", false);

        }
    });
    //////



    saveBtn.on("click", function() {
    	userName.blur();
    	phone.blur();
    	bornDate.blur();

    	if (userName.attr("validateStatus") != "true") {
        	
            userName.blur();
        }else if (bornDate.attr("validateStatus") != "true" ) {
        	
            bornDate.blur();

        } else if (phone.attr("validateStatus") != "true" ) {
        	
            phone.blur();
        } else {
        	//alert("进到最后一个else语句");
            if (confirm("是否确认提交数据")) {
            	//alert("进到最后一个if语句中");
                $("#userForm").submit();
            }


        }
	
	
    });

        
        
        
        
        
        
});