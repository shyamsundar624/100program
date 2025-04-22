package com.shyam.collection;

import java.util.Objects;

public class Product {
int id;
String name;
double price;



@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return Objects.hash(id,name);
}

@Override
public boolean equals(Object obj) {
	if(obj==this)return true;
	if(!(obj instanceof Product)) return false;
	Product product=(Product)obj;
	
	return id==product.id && Objects.equals(name, product.name);
}

public Product(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
}



}
