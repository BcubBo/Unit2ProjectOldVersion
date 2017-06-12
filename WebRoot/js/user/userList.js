/**
 * 
 */
$(function(){
	
	
	//通过jquery的classs选择器(数组)
	//对每个class为viewsUser的元素进行动作绑定（click）
	/**
	 *on,live,delegate
	 *on 
	 * 
	 * 
	 * 
	 */
	$(".viewUser").on("click",function(){
		//将被绑定的元素(a)转换成jquery对象，可以使用jquery方法
		var obj = $(this);
		window.location.href=path+"/user.do?method=view&uid="+obj.attr("userId");
		
		
		
		
	});//viewUserons
	$(".modifyUser").on("click",function(){
		
		var obj = $(this);
		window.location.href = path+"/user.do?method=modify&uid="+obj.attr("userId");
		
		
	});//modifyUser
	
	
	$(".deleteUser").on("click",function(){
		
		var obj=$(this);
		if(confirm("你确定要删除【"+obj.attr("username")+"】吗？")){
			
			$.ajax({
				
				type:"GET",
				url:path+"/user.do",
				data:{method:"deleteUser",uid:obj.attr("userId")},
				dataType:"json",
				success:function(data){
					//删除成功：移除删除行
					if(data.deleteResult =="true"){
						
						alert("删除成功");
						obj.parents("tr").remove();
						
					}else if(data.deleteResult =="false"){
						
						alert("对不起，删除用户【"+obj.attr("username")+"】失败");
		
					}else if(data.deleteResult =="notexist"){
						
						alert("对不起，用户【"+obj.attr("username")+"】不存在");
						
						
					}
					
					
					
				},
				error:function(data){
					
					alert("发生错误,删除失败");
					
				}
				
				
				
				
				
				
				
				
			});//ajax进行删除操作
			
		}
		
		
	});//deleteUser
	
	
	
	
});//function结尾