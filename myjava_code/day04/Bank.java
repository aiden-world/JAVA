
public class Bank {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "��ŵ";
		c.uid = "360321199688888888";
		c.mobilePhone = "18621639083";
		c.address = "�׵۳�ժ�Ǹ�";
		System.out.println(c.say());
		
		
		Account a = new Account();
		a.c = c;
		a.balance = 1000000000;
		a.cid = "88888888888888";
		a.getInfo();
		a.withdraw("1232132132132132", 123213213);
		a.withdraw("360321199688888888", 88888888);
		
		System.out.println(a.getInfo());
	}
	


}


class Account {
	String cid ;
	double balance;
	Customer c = new Customer();
	String getInfo() {
		return "Card info: "+cid+"\t"+balance+"\t"+c.say();
		}
	boolean withdraw(String uuid,double money) {
		if(!uuid.equals(c.uid))  {
			System.out.println("����������������֤��");
			return false;}
		else { 
			balance +=money;
			System.out.println("��ϲ����"+(long)money+"Ԫ,���Ϊ"+(long)balance+"Ԫ");
			return true;
		}
	}
	
	
}

class Customer {
	String name;
	String uid ;
	String mobilePhone ;
	String address;
	String say() {
		return "Customer info: "+name+"\t"+uid+"\t"+mobilePhone+"\t"+address;
	}
	
}