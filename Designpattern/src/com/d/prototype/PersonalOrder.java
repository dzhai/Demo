package com.d.prototype;

public class PersonalOrder implements OrderApi{

	private String customeName;
	private String productid;
	private int orderProductNum;
		
	@Override
	public int getOrderProductNum() {
		return this.orderProductNum;
	}

	@Override
	public void setOrderProductNum(int num) {
		this.orderProductNum=num;
		
	}
	
	public String getCustomeName() {
		return customeName;
	}


	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}


	public String getProductid() {
		return productid;
	}


	public void setProductid(String productid) {
		this.productid = productid;
	}

	@Override
	public OrderApi cloneOrder() {
		PersonalOrder order=new PersonalOrder();
		order.setOrderProductNum(this.getOrderProductNum());
		order.setCustomeName(this.customeName);
		order.setProductid(this.productid);		
		return order;
	}

	
}
