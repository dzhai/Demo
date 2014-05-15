package com.d.aop.aop3;

import com.d.aop.aop2.UserServiceImpl;

import net.sf.cglib.proxy.Enhancer;

public class TestMain {

	public static void main(String[] args) {

		cglibUse1();

	}

	public static void cglibUse1() {

		Enhancer enhancer = new Enhancer();

		// 设置被代理的类（目标类）

		enhancer.setSuperclass(UserServiceImpl.class);

		// 使用回调

		enhancer.setCallback(new CglibProxy());

		// 创造 代理 （动态扩展了UserServiceImpl类）

		UserServiceImpl my = (UserServiceImpl) enhancer.create();

		// my.addUser("001", "centre");

		int ret = my.addOperter(15, 22);

		System.out.println("返回的结果是：" + ret);

	}

}