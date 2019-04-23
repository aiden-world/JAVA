package com.wydhcws.view;

import com.wydhcws.bean.Customer;
import com.wydhcws.service.*;
import com.wydhcws.util.*;

public class CustomerView {
	CustomerList clist = new CustomerList(10);
	
	public void enterMainMenu() {
		System.out.println("-----------------客户信息管理软件-----------------");
		System.out.println();
		System.out.println("\t\t"+"1 添加客户");
		System.out.println("\t\t"+"2 修改客户");
		System.out.println("\t\t"+"3 删除客户");
		System.out.println("\t\t"+"4 退    出");
		System.out.println();
		boolean flag = true;
     do {
		System.out.println("\t\t"+"请选择(1-5):");
		char c = CMUtility.readMenuSelection() ;
		switch(c){
		case '1':
			this.addNewCustomer();
			break;
		case '2':
			this.modifyCustomer();
			break;
		case '3':
			this.deleteCustomer();
			break;
		case '4':
			this.listAllCustomers();
			break;
		case '5':
			flag = false;
			break;
			}
     }while(flag);
	}

	private void addNewCustomer() {
		Customer c = new Customer();
		System.out.println("\n" +"---------------------添加客户---------------------");
		System.out.println("姓名:");
		c.setName(CMUtility.readString(5));
		System.out.println("性别:");
		c.setGendar(CMUtility.readChar());
		System.out.println("年龄:");
		c.setAge(CMUtility.readInt());
		System.out.println("电话:");
		c.setPhone(CMUtility.readString(20));
		System.out.println("邮箱:");
		c.setEmail(CMUtility.readString(20));
		clist.addCustomer(c);
		System.out.println("---------------------添加完成---------------------");
	}
	
	private void modifyCustomer() {
		System.out.println("\n" +"---------------------修改客户---------------------");
		System.out.println("请选择待修改客户编号(-1退出)：");
		int n = CMUtility.readInt();
		if(n!=-1) {
			Customer c = new Customer();
			System.out.println("姓名:");
			c.setName(CMUtility.readString(5,clist.getCustomer(n).getName()));//也可clist.getCustomers()[n-1].getPhone())
			System.out.println("性别:");
			c.setGendar(CMUtility.readChar(clist.getCustomer(n).getGendar()));
			System.out.println("年龄:");
			c.setAge(CMUtility.readInt(clist.getCustomer(n).getAge()));
			System.out.println("电话:");
			c.setPhone(CMUtility.readString(20,clist.getCustomer(n).getPhone()));
			System.out.println("邮箱:");
			c.setEmail(CMUtility.readString(20,clist.getCustomer(n).getEmail()));
			clist.replaceCustomer(n, c);
		}	
	}
	
	

	private void deleteCustomer() {
		System.out.println("\n" +"---------------------删除客户---------------------");
		System.out.println("请选择待删除客户编号(-1退出) : " );
		int n = CMUtility.readInt();
		if(n!=-1) {
			System.out.println("确认是否删除(Y/N):");
			char c = CMUtility.readConfirmSelection();
			if(c=='Y') {
				clist.deleteCustomer(n);
				System.out.println("---------------------删除完成---------------------");
			}
		}				
	}

	
	private void listAllCustomers() {
		System.out.println("\n" +"---------------------客户列表---------------------");
		System.out.println("编号"+"\t"+"姓名"+"\t"+"性别"+"\t"+"年龄"+"\t"+"电话"+"\t"+"邮箱");
		for(int i=0;i<clist.getTotal();i++) {
			System.out.println((i+1)+"\t"+clist.getCustomer(i+1).getName()+"\t"+clist.getCustomer(i+1).getGendar()
					+"\t"+clist.getCustomer(i+1).getAge()+"\t"+clist.getCustomer(i+1).getPhone()+"\t"+clist.getCustomer(i+1).getEmail());
		}
		System.out.println("---------------------客户列表完成---------------------");
	}


}
