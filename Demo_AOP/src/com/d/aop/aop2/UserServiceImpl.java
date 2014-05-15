package com.d.aop.aop2;

public class UserServiceImpl implements UserService, Service {
	@Override
	public void addUser(String userId, String userName) {

		System.out.println("UserServiceImpl addUser userId->>" + userId);

	}

	@Override
	public void delUser(String userId) {

		System.out.println("UserServiceImpl delUser userId->>" + userId);

	}

	@Override
	public void modfiyUser(String userId, String userName) {

		System.out.println("UserServiceImpl modfiyUser userId->>" + userId);

	}

	@Override
	public String findUser(String userId) {

		System.out.println("UserServiceImpl findUser userId->>" + userId);

		return "张山";

	}

	@Override
	public void sayHello(String name) {

		System.out.println("你好：" + name);

	}

	@Override
	public int addOperter(int num, int num2) {

		return num + num2;

	}
}
