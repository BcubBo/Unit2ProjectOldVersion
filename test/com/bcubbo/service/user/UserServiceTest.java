package com.bcubbo.service.user;

import static org.junit.Assert.*;

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

}
