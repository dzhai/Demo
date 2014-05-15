package com.d.aop.aop2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	@Test
	public void test() {
		Service Service = (Service)new LogHandler().newInstance(new UserServiceImpl());

        UserService userService = (UserService)new LogHandler().newInstance(new UserServiceImpl());

        userService.addUser("001", "centre");

        String name = userService.findUser("002");

        System.out.println(name);

        int num = Service.addOperter(12, 23);

        System.out.println(num);

        Service.sayHello("centre");
	}

}
