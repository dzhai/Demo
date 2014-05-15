package com.d.aop.aop4;

public class SecInterceptor implements Interceptor {

	@Override
	public void intercept(ActionInvocation invocation) {

		System.out.println(2);

		invocation.invoke();

		System.out.println(-2);

	}

}