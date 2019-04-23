package com.wydhcws.service;

import com.wydhcws.bean.*;

public class CustomerList {
	private Customer[] customers;
	private int total = 0;

	public Customer[] getCustomers() {
		return customers;
	}

	public int getTotal() {
		return total;
	}

	public CustomerList() {
	}

	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	public boolean addCustomer(Customer customer) {
		if (total >= this.customers.length) {
			return false;
		} else {
			customers[total] = customer;
			total++;
			return true;
		}
	}

	public boolean replaceCustomer(int index, Customer cust) {
		if (index > this.total || index < 0) {
			return false;
		} else {
			customers[index - 1] = cust;
			return true;
		}
//		if(index>this.customers.length||index<0) {return false; }
//		else {
//			if(customers[index-1]!=null) {
//			customers[index-1] = cust ;
//			return true ; 
//			}
//			else {
//				customers[index-1] = cust ;
//				total++;
//				return true ; }
//		}
	}

	// 删除索引元素后,将后面元素往前挤
	public boolean deleteCustomer(int index) {
		if (index > this.total || index < 0) {
			return false;
		} else {
			for (int i = index - 1; i < this.total - 1; i++) {
				customers[index - 1] = customers[index];
			}
			total--;
			return true;
		}
	}

	public Customer[] getAllCustomers() {
		Customer[] allCus = new Customer[total];
		for (int i = 0; i < total; i++) {
			allCus[i] = customers[i];
		}
		return allCus;
	}

	public Customer getCustomer(int index) {
		if (index > this.total || index < 0)
			return null;
		else
			return customers[index - 1];
	}

}
