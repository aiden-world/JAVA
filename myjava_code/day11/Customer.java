

public class Customer {
	private String name ;
	private String identityID ;
	private String telePhone ;
	private String address ;


	
	public Customer() {}
	public Customer(String n,String i,String t,String a) {
		name = n ;
		identityID = i ;
		telePhone =  t;
		address = a ;
	}
	public String say() {return "姓名="+name+"\t"+"身份证号="+identityID
			+"\t"+"手机号="+telePhone+"\t"+"地址="+address ;}
	public String getName() {return name;}
	
}
