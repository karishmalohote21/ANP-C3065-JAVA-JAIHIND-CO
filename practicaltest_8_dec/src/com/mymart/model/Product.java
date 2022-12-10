package com.mymart.model;
import java.util.HashSet;
import java.util.Objects;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product(int productId,String productName,double productPrice)
	{
		super();
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId =productId;
	}
	
	public String getProductName() {
		return productName;
	}	
	public void setProductName(String productName) {
		this.productName =productName;
	}
	
	public double getProductPrice() {
		return productPrice;
	}	
	public void setProductPrice(double productPrice) {
		this.productPrice =productPrice;
	}
		
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return"Product[productId="+productId+",productName="+productName+",productPrice="+productPrice+"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(productId,productName,productPrice);	}
}
















