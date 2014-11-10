package com.d.builder.demo2;

public class Test {

	public static void main(String[] args) {
		
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("zhangsan@sdfa.com", "dzhai@qq.com");

		
		builder = new GoodByeBuilder();
		director = new Director(builder);
		director.construct("zhangsan@sdfa.com", "dzhai@qq.com");

	}

}
