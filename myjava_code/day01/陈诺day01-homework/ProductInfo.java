import java.util.Scanner;
public class ProductInfo {
	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("��������Ʒ����");
	String name = s1.next();
	System.out.println("��������Ʒ����");
	int salesVolume = s1.nextInt();
	System.out.println("��������Ʒ�����");
	long inventory = s1.nextLong();
	System.out.println("��������Ʒ�۸�");
	double price = s1.nextDouble();
	System.out.println("��������Ʒ����");
	String description = s1.next();
	System.out.println("----------------");
	System.out.println(name);
	System.out.println(salesVolume);
	System.out.println(inventory);
	System.out.println(price);
	System.out.println(description);
	}
}