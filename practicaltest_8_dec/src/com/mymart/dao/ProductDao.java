package com.mymart.dao;

import java.util.LinkedList;
import com.mymart.model.Product;

public class ProductDao {
private static LinkedList<Product> list =new LinkedList<Product>();

public void addProduct(Product product) {
	list.add(product);
}
public LinkedList<Product> getAllProducts(){
	return list;
}
public LinkedList<Product> searchProductNameStartingWithLetter(String c)
{
	LinkedList<Product> l2 = new LinkedList<Product>();
	for(Product p1 : list)
	{
		if(p1.getProductName().startsWith(c))
		{
			l2.add(p1);
		}
	}
	return l2;
}

public void searchProductByID(int ID)
{
	int n = ID;
	String s = new String();
	for(Product p1 : list )
	{
		if(p1.getProductId()==n)
		{
			System.out.println("The Product Details are :");
			System.out.println("The Product ID is :"+p1.getProductId()); 
			System.out.println("The Product Name is :"+ p1.getProductName()); 
			System.out.println("The Product Price is :"+ p1.getProductPrice());
		}
	}
}

public void deleteProductByID(int ID)
{
	for(Product p1 : list)
	{
		if(p1.getProductId()==ID)
		{
			list.remove(p1);
		}
	}
}
}

