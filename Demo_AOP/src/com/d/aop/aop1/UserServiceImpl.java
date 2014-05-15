package com.d.aop.aop1;

public class UserServiceImpl implements UserService {
	public void addUser(String username) {
         System.out.println("实现方法 添加User："+username);
	}
}
