package com.d.aop.aop4;

public class ThirInterceptor implements Interceptor {

	@Override
	public void intercept(ActionInvocation invocation) {

		System.out.println(3);

		invocation.invoke();

		System.out.println(-3);

	}

}