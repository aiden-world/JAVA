/*
2�����������˻���Account�������ԣ�����cid�����balance�������û�Customer   
   �����˻���Account�з�����
   ��1��getInfo()������String���ͣ����ؿ�����ϸ��Ϣ
   ��2��ȡǮ����withdraw()������������ƣ����ȡǮ�ɹ�����true��ʧ�ܷ���false
   ��3����Ǯ����save(),����������ƣ������Ǯ�ɹ�����true,ʧ�ܷ���false
   
   ����Customer�������������֤�š���ϵ�绰����ͥ��ַ������
       Customer���з���say()������String���ͣ��������ĸ�����Ϣ��

   �ڲ�����Bank�д��������˻��������û�����󣬲�������Ϣ������ʾ��Ϣ
   */
class Day8_Homework2{
	public static void main(String[] args){
		Customer c = new Customer();
		c.setName("�޴�ΰ");
		c.setCardId("123456789");
		c.setAddress("�й��");
		c.setTel("10086");
		
		Account a = new Account();
		a.setCid("111111111111111111");
		a.setBalance(100);
		a.setOwner(c);
		
		boolean flag = a.withdraw(1000);
		if(flag){
			System.out.println("ȡ��ɹ�");
		}else{
			System.out.println("ȡ��ʧ��");
		}
		
		System.out.println("���" + (a.save(200)?"�ɹ�":"ʧ��"));
		
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
		return "���ţ�" +  cid + "����" + balance + "��������Ϣ��" + owner.say()  ;
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
		return "������" + name + "�����֤�ţ�" + cardId + "���绰���룺" +tel + "����ַ��" + address;
	}
}