/*
2、定义银行账户类Account，有属性：卡号cid，余额balance，所属用户Customer   
   银行账户类Account有方法：
   （1）getInfo()，返回String类型，返回卡的详细信息
   （2）取钱方法withdraw()，参数自行设计，如果取钱成功返回true，失败返回false
   （3）存钱方法save(),参数自行设计，如果存钱成功返回true,失败返回false
   
   其中Customer类有姓名、身份证号、联系电话、家庭地址等属性
       Customer类有方法say()，返回String类型，返回他的个人信息。

   在测试类Bank中创建银行账户类对象和用户类对象，并设置信息，与显示信息
   */
class Day8_Homework2{
	public static void main(String[] args){
		Customer c = new Customer();
		c.setName("崔达伟");
		c.setCardId("123456789");
		c.setAddress("尚硅谷");
		c.setTel("10086");
		
		Account a = new Account();
		a.setCid("111111111111111111");
		a.setBalance(100);
		a.setOwner(c);
		
		boolean flag = a.withdraw(1000);
		if(flag){
			System.out.println("取款成功");
		}else{
			System.out.println("取款失败");
		}
		
		System.out.println("存款" + (a.save(200)?"成功":"失败"));
		
		System.out.println(a.getInfo());
	}
}  
class Account{
	private String cid;
	private double balance;
	private Customer owner;
	
	public void setCid(String c){
		cid = c;
	}
	public String getCid(){
		return cid;
	}
	public void setBalance(double b){
		balance = b;
	}
	public double getBalance(){
		return balance;
	}
	public void setOwner(Customer c){
		owner = c;
	}
	public Customer getOwner(){
		return owner;
	}
	
	public boolean withdraw(double money){
		if(money >=0 && money <= balance){
			balance -= money;
			return true;
		}
		return false;
	}
	public boolean save(double money){
		if(money>=0) {
			balance += money;
			return true;
		}
		return false;
	}
	
	public String getInfo(){
		return "卡号：" +  cid + "，余额：" + balance + "，户主信息：" + owner.say()  ;
	}
}

class Customer{
	private String name;
	private String cardId;
	private String tel;
	private String address;
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setCardId(String id){
		cardId = id;
	}
	public String getCardId(){
		return cardId;
	}
	public void setTel(String t){
		tel = t;
	}
	public String getTel(){
		return tel;
	}
	public void setAddress(String a){
		address = a;
	}
	public String getAddress(){
		return address;
	}
	
	public String say(){
		return "姓名：" + name + "，身份证号：" + cardId + "，电话号码：" +tel + "，地址：" + address;
	}
}