

public class Bank {
	public static void main(String[] args) {
		Customer c=new Customer("��ǿ��","360321197510232290","13879993324","����ʡ��Ǩ");
		Account account1 = new Account(10000000000.0,"14141214213124141",c);
		System.out.println(c.say());
		System.out.println(account1.getInfo());
		account1.save(1321213.0);
		System.out.println(account1.getInfo());
		account1.withdraw(121321321.0);
		System.out.println(account1.getInfo());

		
		
	}
}
