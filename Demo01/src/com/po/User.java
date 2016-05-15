package com.po;

public class User {
	private String id;
	private String product;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	
	public User(){
		
	}
	
	public User(String id,String product){
		this.id=id;
		this.product=product;
	}
}
