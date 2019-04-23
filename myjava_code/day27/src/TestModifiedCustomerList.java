import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestModifiedCustomerList {
	public static void main(String[] args) {
		ModifiedCustomerList mcl = new ModifiedCustomerList(7);
		mcl.addCustomer(new Customer( "大明", '男', 32, "13888888888", "1078888888"));
		mcl.addCustomer(new Customer( "二明", '女', 24, "13936276388", "1032423241"));
		mcl.addCustomer(new Customer( "三明", '男', 19, "13242357648", "1123141328"));
		mcl.addCustomer((Customer)mcl.cusList.toArray()[2]);

//		Collection 可以元素重复
//		for(Object obj : mcl.cusList) {
//			System.out.println(obj.hashCode());
//		}
		
		mcl.PrintAllCustomers();
		Customer c1 = new Customer( "关羽", '男', 42, "13887778888", "6666888888");
		mcl.replaceCustomer(2, c1);
		System.out.println("改变第二个元素");
		mcl.PrintAllCustomers();
		mcl.deleteCustomer(2);
		System.out.println("删除第二个元素");
		mcl.PrintAllCustomers();
		
//		System.out.println(mcl.cusList);
//		System.out.println(mcl.cusList.getClass());

		
		
	}
}



 class ModifiedCustomerList{
	Collection cusList;
	
	public ModifiedCustomerList() {
		  cusList = new ArrayList();
	}
	public ModifiedCustomerList(int totalCustomer) {
		 cusList = new ArrayList(totalCustomer);
	}
	
	public void addCustomer(Customer c) {
		cusList.add(c);
	}
	public Customer getCustomer(int index){
		if(index>=1&&index<=cusList.toArray().length)
		return  (Customer)cusList.toArray()[index-1];
		else throw new RuntimeException("索引输入错误");
	}
	
	//直接导出失败,导出复制数组
	public Customer[] getAllCustomers() {	
//		return (Customer[])cusList.toArray(); //运行时报错ClassCastException
//	    Customer[] cus= new Customer[10];return   cusList.toArray(cus);//也报错,学了泛型再看
		Object[] objs = cusList.toArray();
		Customer[] cuss= new Customer[objs.length];
		for (int i = 0; i < objs.length; i++) {
		cuss[i] = (Customer)objs[i];
	}
		return cuss ;
}
	
	public boolean deleteCustomer(int index) {
		if(index>=1&&index<=cusList.toArray().length) {
		cusList.remove(cusList.toArray()[index-1]);	
		return true;
		}
		else throw new RuntimeException("索引输入错误");
	}
	
	//需要验证直接修改导出数组中元素对集合是否有影响
	public boolean replaceCustomer(int index, Customer cust) {
		if(index>=1&&index<=cusList.toArray().length) {
			cusList.remove(cusList.toArray()[index-1]);
			((ArrayList)cusList).add(index-1,cust);	
		return true;
		} 
		else throw new RuntimeException("索引输入错误");
	}
	
	public void PrintAllCustomers() {
		for(int i=0 ;i<getAllCustomers().length;i++) {
			System.out.println(getAllCustomers()[i]);
		}
	}
	
	
	
	
	
	
	
	
//	static { 
//		cusList.add(new Customer( "四明", '男', 32, "13888888888", "1078888888"));
//		cusList.add(new Customer( "五明", '女', 24, "13936276388", "1032423241"));
//	}
	
}
 
 
 
 class Customer {
		private String name ;
		private char gendar ;
		private int age;
		private String phone ;
		private String email ;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public char getGendar() {
			return gendar;
		}
		public void setGendar(char gendar) {
			this.gendar = gendar;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public Customer() {
			super();
		}
		public Customer(String name, char gendar, int age, String phone, String email) {
			super();
			this.name = name;
			this.gendar = gendar;
			this.age = age;
			this.phone = phone;
			this.email = email;
		}
		@Override
		public String toString() {
			return "Customer [name=" + name + ", gendar=" + gendar + ", age=" + age + ", phone=" + phone + ", email="
					+ email + "]";
		}
		
		
		
}