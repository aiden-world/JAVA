import java.util.Scanner;
public class TestBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book[] myBook = new Book[5];
		for(int i =0 ;i<myBook.length;i++) {
		myBook[i] = new Book();
		System.out.println("请输入第"+(i+1)+"本书的信息(共5本),格式:书名   价格");
		String s = input.next();
		double p = input.nextDouble();
		myBook[i].setTitle(s) ;
		myBook[i].setPrice(p);	
		}
		System.out.println("对存储的5本书按照价格排序,结果如下:");
		for(int i= 1;i<myBook.length;i++)
			for(int j=0;j<myBook.length-i;j++) {
				if(myBook[j+1].getPrice()>myBook[j].getPrice()) {
				 Book temp= myBook[j+1];
				 myBook[j+1]=myBook[j];
				 myBook[j]=temp;
				}
			}
		
		for(int i=0;i<myBook.length;i++) 
			myBook[i].getInfo();	
	}
}


class Book{
	private String title ;
	private double price ;
	
	public Book() {} 
	public Book(String t,double p,String a) {
		title = t;
		price = p;
	}
	public void setTitle(String t ) { title = t;}
	public void setPrice(double p ) {price = p;}
	public String getTitle() { return title;}
	public double getPrice() { return price;}
	
	public void getInfo() {
		System.out.println("title=  "+title+"\t"+"price=  "+price);
	}
	
}