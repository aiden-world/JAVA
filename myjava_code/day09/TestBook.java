
public class TestBook {
	public static void main(String[] args) {
		Book[] fourBig = new Book[4];
		for(int i =0 ;i<fourBig.length;i++) {
		fourBig[i] = new Book();
		}
		fourBig[0].setTitle("��������") ;
		fourBig[1].setTitle("���μ�") ;
		fourBig[2].setTitle("ˮ䰴�" );
		fourBig[3].setTitle("��¥��" );
		fourBig[0].setPrice(13.5);
		fourBig[1].setPrice(12.5);
		fourBig[2].setPrice(11.5);
		fourBig[3].setPrice(10.5);
		fourBig[0].setAuthor("�޹���");
		fourBig[1].setAuthor("��ж�");
		fourBig[2].setAuthor("ʩ����");
		fourBig[3].setAuthor("��ѩ��");
		
		
		for(int i=0;i<fourBig.length;i++) {
			System.out.println(fourBig[i].title+'\t'+fourBig[i].price+'\t'+fourBig[i].author);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}


class Book{
	String title ;
	double price ;
	String author;
	
	public Book() {} 
	public Book(String t,double p,String a) {
		title = t;
		price = p;
		author = a;
	}
	public void setTitle(String t ) { title = t;}
	public void setPrice(double p ) {price = p;}
	public void setAuthor(String a ) {author = a;}
	public String getTitle() { return title;}
	public double getPrice() { return price;}
	public String getAuthor() { return author;}
}