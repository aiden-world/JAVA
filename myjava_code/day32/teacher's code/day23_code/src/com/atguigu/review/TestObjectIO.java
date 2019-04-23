package com.atguigu.review;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestObjectIO {
	public static void main(String[] args) throws IOException {
		Account a = new Account(1000,new Customer());
		
		FileOutputStream fos = new FileOutputStream("account.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a);
		
		oos.close();
		fos.close();
	}
}
class Account implements Serializable{
	private double balance;
	private transient Customer owner;
	public Account(double balance, Customer owner) {
		super();
		this.balance = balance;
		this.owner = owner;
	}
	
}
class Customer{
	private String name;
}