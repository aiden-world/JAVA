package com.atguigu.view;

import com.atguigu.bean.Customer;
import com.atguigu.service.CustomerList;
import com.atguigu.util.CMUtility;

public class CustomerView {
	//创建CustomerList的对象
	CustomerList cl = new CustomerList();//因为使得list()，add()等共同同一个cl，即共用同一个all数组
	
	public void menu(){
		while(true){
			System.out.println("-----------------客户信息管理软件-----------------");
	
			System.out.println("\t\t1 添 加 客 户");
			System.out.println("\t\t2 修 改 客 户");
			System.out.println("\t\t3 删 除 客 户");
			System.out.println("\t\t4 客 户 列 表");
			System.out.println("\t\t5 退           出");
	
			System.out.print("\t\t请选择(1-5)：");
			char select  = CMUtility.readMenuSelection();
			
			switch(select){
			case '1':
				add();
				break;
			case '2':
				update();
				break;
			case '3':
				delete();
				break;
			case '4':
				list();
				break;
			case '5':
				System.out.print("是否真的退出(Y/N)：");
				char confirm = CMUtility.readConfirmSelection();
				
				if(confirm == 'Y'){
					return;
				}
			}
		}
	}

	private void list() {
		System.out.println("---------------------------客户列表---------------------------");
		//（2）调用CustomerList的对象的getAll()拿到所有的客户对象
		Customer[] customers = cl.getAll();
		
		//（3）遍历显示
		System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
		for (int i = 0; i < customers.length; i++) {
			System.out.println((i+1) + "\t" + customers[i].getInfo());
		}
		System.out.println("-------------------------客户列表完成-------------------------");
	}

	private void delete() {
		
	}

	private void update() {
		
	}

	private void add() {
		System.out.println("---------------------添加客户---------------------");
		//(1)从键盘输入客户的信息
		System.out.print("姓名：");
		String name = CMUtility.readString(20);
		
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		
		System.out.print("年龄：");
		int age = CMUtility.readInt() ;
		
		System.out.print("电话：");
		String phone = CMUtility.readString(11);
		
		System.out.print("邮箱：");
		String email = CMUtility.readString(32);
		
		//（2）创建一个Customer对象
		Customer c = new Customer(name, gender, age, phone, email);
		
		//（3）存到数组中
		
		//调用CustomerList的对象的
		boolean flag = cl.addCustomer(c);
		if(flag){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		
		System.out.println("---------------------添加完成---------------------");
	}
}
