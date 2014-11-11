package com.d.prototype;

public class OrderBusiness {

	public void saveOrder(OrderApi order){
		System.out.println("order Num "+order.getOrderProductNum());
		while(order.getOrderProductNum()>1000){
		
			OrderApi newOrder=order.cloneOrder();
			newOrder.setOrderProductNum(1000);
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			System.out.println("order Num "+order.getOrderProductNum()+" new order---");
			
		}
		System.out.println("order Num "+order.getOrderProductNum());
	}
	
}
