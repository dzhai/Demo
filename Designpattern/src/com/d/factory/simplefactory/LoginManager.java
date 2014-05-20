package com.d.factory.simplefactory;

public class LoginManager {
	public Login factory(String type) {
		if (type.equals("password")) {
			System.out.println("您从工厂里拿到的是：口令认证");
			return new PasswordLogin();
		} else if (type.equals("passcode")) {
			System.out.println("您从工厂里拿到的是：域认证");
			return new DomainLogin();
		} else {

			throw new RuntimeException("没有找打此登陆方式");
		}

	}
}
