package com.d.aop.aop2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler{
  private Object targertObject;
	
  public Object newInstance(Object targertObject){
	  this.targertObject=targertObject;
	  Class targertClass=targertObject.getClass();
	  return Proxy.newProxyInstance(targertClass.getClassLoader(), targertClass.getInterfaces(), this);
	  
  }
  
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		System.out.println("调用方法："+method.getName());
		Object ret=null;
		try{
			ret=method.invoke(targertObject, args);
			System.out.println("成功调用方法："+method.getName()+" 参数为：");
			for(int i=0;i<args.length;i++){
				System.out.println(args[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return ret;
	}

}
