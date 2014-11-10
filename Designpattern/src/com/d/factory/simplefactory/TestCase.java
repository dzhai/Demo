package com.d.factory.simplefactory;

import org.junit.Test;

public class TestCase {

	
	@Test
	public void test(){
		testpassword();
		System.out.println("--------");
		testdomain();
	}
	
	private void testpassword() {
		String loginType = "password";
		String name = "name";
		String password = "password";
		Login login = new LoginManager().factory(loginType);
		boolean bool = login.verify(name, password);
		if (bool) {
			// TODO
		} else {
			// TODO
		}
	}
	
	private void testdomain() {
		String loginType = "passcode";
		String name = "name";
		String password = "password";
		Login login = new LoginManager().factory(loginType);
		boolean bool = login.verify(name, password);
		if (bool) {
			// TODO
		} else {
			// TODO
		}
	}

}
