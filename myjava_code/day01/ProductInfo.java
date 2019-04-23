import java.util.Scanner;
public class ProductInfo {
	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("请输入商品名称");
	String name = s1.next();
	System.out.println("请输入商品销量");
	int salesVolume = s1.nextInt();
	System.out.println("请输入商品库存量");
	long inventory = s1.nextLong();
	System.out.println("请输入商品价格");
	double price = s1.nextDouble();
	System.out.println("请输入商品描述");
	String description = s1.next();
	System.out.println("----------------");
	System.out.println(name);
	System.out.println(salesVolume);
	System.out.println(inventory);
	System.out.println(price);
	System.out.println(description);
	}
}