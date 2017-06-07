package com.bcubbo.service.user;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.bcubbo.pojo.User;

import junit.framework.Assert;



public class UserServiceTest {
	private UserService userService;
	@Before
	public void setUp() throws Exception {
		
		userService = new UserServiceImpl();
		
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		User user = new User();
		
		user.setUserCode("1001");
		user.setUserName("1001UserName");
		userService.add(user);
		boolean result = userService.add(user);
		//断言，模拟假设得到结果是否和预期一致
		Assert.assertTrue("增加失败",result);
		
	}
	@Test
	public void testGetUserList(){
		//测试方法，只将该方法的必要条件列出即可
		List<User> userList = new ArrayList<User>();
		userList = userService.getUserList("user");
		Assert.assertEquals(4, userList.size());
		
		
	};

}
