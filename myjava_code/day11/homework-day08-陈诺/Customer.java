

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
	public String say() {return "����="+name+"\t"+"���֤��="+identityID
			+"\t"+"�ֻ���="+telePhone+"\t"+"��ַ="+address ;}
	public String getName() {return name;}
	
}
