package com.atguigu.service;

import com.atguigu.bean.Customer;

public class CustomerList {
	private Customer[] all;//用来存储客户对象的数组
	private int total;//好比是停车场管理员，时刻记录停车场中的车的数量
	
	public CustomerList(){
		all = new Customer[5];
	}
	public CustomerList(int length){
		all = new Customer[length];
	}
	
	//添加一个客户对象到数组all的方法
	public boolean addCustomer(Customer customer){
		if(total >= all.length){
			System.out.println("数组已满");
			return false;
		}
		all[total] = customer;
		total++;
		return true;
	}
	
/*	//根据下标删除一个客户对象的方法
	public boolean removeCustomer(int index){
		//...
	}
	
	//根据下标查询（获取）一个客户对象的方法
	public Customer getByIndex(int index){
		//...
	}
	
	//根据下标替换一个客户对象的方法
	public boolean replace(int index,Customer newCustomer){
		
	}*/
	
	//返回/获取所有客户对象的方法
	public Customer[] getAll(){
		//return all;
		//有total个就给total个
		Customer[] result = new Customer[total];
		for (int i = 0; i < result.length; i++) {
			result[i] = all[i];
		}
		return result;
	}
}
