package com.d.aop.aop1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	@Test
	public void test() {
	  UserService us=new UserServiceImpl();
	  new UserServiceImplProxy(us).addUser("zhang san");
	}

}
