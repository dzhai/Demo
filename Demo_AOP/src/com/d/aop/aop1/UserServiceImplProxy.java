package com.d.aop.aop1;

public class UserServiceImplProxy implements UserService{

	private UserService userService;
	
	public UserServiceImplProxy(UserService userService){
		this.userService=userService;
	}
	@Override
	public void addUser(String username) {	  
		System.out.println("Before TODO");
		userService.addUser(username);
		System.out.println("After TODO");
	}

}
