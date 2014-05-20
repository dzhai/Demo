package com.d.factory.simplefactory;

import org.junit.Test;

public class TestFactory {
	@Test
	public void testfactory() {
		String loginType = "password";
		String loginType2 = "passcode";
		String name = "name";
		String password = "password";
		Login login = new LoginManager().factory(loginType2);
		boolean bool = login.verify(name, password);
		if (bool) {
			// TODO
		} else {
			// TODO
		}
	}
}
