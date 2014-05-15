package com.d.aop.aop3;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("调用的方法是：" + method.getName());

		Object ret = null;

		try {

			ret = proxy.invokeSuper(obj, args);

			System.out.print("成功调用方法：" + method.getName() + ";参数为：");

			for (int i = 0; i < args.length; i++) {

				System.out.print(args[i]);

			}

		} catch (Exception e) {

			e.printStackTrace();

			System.out.print("调用方法：" + method.getName() + "失败;参数为：");

			for (int i = 0; i < args.length; i++) {

				System.out.print(args[i]);

			}

		}

		return ret;

	}

}
