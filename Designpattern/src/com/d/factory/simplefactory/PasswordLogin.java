package com.d.factory.simplefactory;

public class PasswordLogin implements Login {

	@Override
	public boolean verify(String name, String pwd) {
		
		return true;
	}

}
