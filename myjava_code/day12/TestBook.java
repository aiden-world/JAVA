
import java.util.Scanner;

public class TestBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book b1 = new Book("大主宰", 66.6);
		Book b2 = new Book("遮天", 68.8, "辰东", 100000, 50000);
		b1.getInfo();
		b2.getInfo();
	}
}

//		System.out.println("请输入一共几本书");
//		int n = input.nextInt();
//		Book[] myBook = new Book[n];
//		for(int i =0 ;i<myBook.length;i++) {
//		myBook[i] = new Book();
//		System.out.println("请输入第"+(i+1)+"本书的信息(共5本),格式:书名");
//		String s = input.next();
//		double p = input.nextDouble();
//		myBook[i].setTitle(s) ;
//		myBook[i].setPrice(p);	
//		}
//		
//		System.out.println("对存储的"+myBook.length+"本书按照价格排序,结果如下:");
//		for(int i= 1;i<myBook.length;i++)
//			for(int j=0;j<myBook.length-i;j++) {
//				if(myBook[j+1].getPrice()>myBook[j].getPrice()) {
//				 Book temp= myBook[j+1];
//				 myBook[j+1]=myBook[j];
//				 myBook[j]=temp;
//				}
//			}
//		
//		for(int i=0;i<myBook.length;i++) 
//			myBook[i].getInfo();	
//	}
//}

class Book {
	private String title;
	private double price;
	private String author;
	private long inventory;
	private long orderVolume;

	public Book() {
	}

	public Book(String t, double p) {
		title = t;
		price = p;
	}

	public Book(String t, double p, String a, long i, long o) {
		this(t, p);
		author = a;
		inventory = i;
		orderVolume = o;
	}

	public Book(String title, double price, String author, long inventory) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.inventory = inventory;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getInventory() {
		return inventory;
	}

	public void setInventory(long inventory) {
		this.inventory = inventory;
	}

	public long getOrderVolume() {
		return orderVolume;
	}

	public void setOrderVolume(long orderVolume) {
		this.orderVolume = orderVolume;
	}

	public void setTitle(String t) {
		title = t;
	}

	public void setPrice(double p) {
		price = p;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public void getInfo() {
		System.out.println("title=  " + title + "\t" + "price=  " + price + "author=  " + author + "\t" + "inventory=  "
				+ inventory + "\t" + "orderVolume=  " + orderVolume);
	}

}
