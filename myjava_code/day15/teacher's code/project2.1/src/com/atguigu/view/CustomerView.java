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
		System.out.println("---------------------删除客户---------------------");
//		(1)先输入编号
		System.out.print("请选择待删除客户编号(-1退出)：");
		int id = CMUtility.readInt();
		if(id==-1){
			return;//退出删除功能
		}
		
		//(2)确认是否删除
		System.out.print("确认是否删除(Y/N)：");
		char confirm = CMUtility.readConfirmSelection();
		if(confirm == 'N'){
			return;//退出删除功能
		}
		
		//(3)真正删除
		//调用CustomerList对象的removeCustomer(index)
		boolean flag = cl.removeCustomer(id-1);//下标index = 编号id-1
		if(flag){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		
		System.out.println("---------------------删除完成---------------------");
	}

	private void update() {
		System.out.println("---------------------修改客户---------------------");
//		(1)先输入编号
		System.out.print("请选择待修改客户编号(-1退出)：");
		int id = CMUtility.readInt();
		if(id==-1){
			return;//退出修改功能
		}
		
//		(2)根据编号拿到客户的原信息
		//调用CustomerList对象的getByIndex(index)
		//index = id - 1
		Customer old = cl.getByIndex(id-1);
		if(old == null){
			System.out.println(id + "客户不存在");
			return;
		}
		
		//(3)从键盘输入新数据
		System.out.print("姓名(" + old.getName() +")：");
		
		//public static String readString(int limit, String defaultValue)
		//20表示名字最长不超过20个字符，   defaultValue表示如果没有输入还是返回old.getName()
		String name = CMUtility.readString(20, old.getName());
		
		System.out.print("性别("+ old.getGender() +")：");
		//public static char readChar(char defaultValue)
		char gender = CMUtility.readChar(old.getGender());
		
		System.out.print("年龄("+ old.getAge() +")：");
		//public static int readInt(int defaultValue)
		int age = CMUtility.readInt(old.getAge()) ;
		
		System.out.print("电话("+ old.getPhone() +")：");
		String phone = CMUtility.readString(11,old.getPhone());
		
		System.out.print("邮箱(" + old.getEmail() + ")：");
		String email = CMUtility.readString(32, old.getEmail());
		
		//(4)创建新的Customer对象
		Customer newCustomer = new Customer(name, gender, age, phone, email);
		
		//(5)替换数组中[index]位置的原对象
		//调用CustomerList对象replace方法
		boolean flag = cl.replace(id-1, newCustomer);
		if(flag){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
		
		System.out.println("---------------------修改客户---------------------");
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
