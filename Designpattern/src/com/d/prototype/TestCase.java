package com.d.prototype;

import org.junit.Test;

public class TestCase {

	@Test
	public void test(){
		OrderBusiness business=new OrderBusiness();
		PersonalOrder order=new PersonalOrder();
		order.setCustomeName("personal");
		order.setProductid("1");
		order.setOrderProductNum(2333);
		business.saveOrder(order);
	}
	
}
