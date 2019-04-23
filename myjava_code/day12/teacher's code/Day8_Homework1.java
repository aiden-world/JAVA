/*
1、
（1）声明一个图书类型Book
（2）包含属性：标题、价格
（3）属性私有化，提供get/set方法
（4）提供getInfo()方法
（5）在测试类中，创建Book[]数组，存储5本书，并从键盘输入图书信息，并按照价格从高到低排序
*/
class Day8_Homework1{
	public static void main(String[] args){
		Book[] array = new Book[5];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		for(int i=0; i<array.length; i++){
			array[i] = new Book();
			System.out.print("请输入第" + (i+1) + "本书的标题：");
			String title = input.next();
			array[i].setTitle(title);
			
			System.out.print("请输入第" + (i+1) + "本书的价格：");
			double price = input.nextDouble();
			array[i].setPrice(price);
		}
		
		//并按照价格从高到低排序
		for(int i=1; i<array.length; i++){
			for(int j=0; j<array.length-i; j++){
				if(array[j].getPrice() < array[j+1].getPrice()){
					Book temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		//遍历
		for(int i=0; i<array.length; i++){
			System.out.println(array[i].getInfo());
		}
		
	}
}
class Book{
	private String title;
	private double price;
	
	public void setTitle(String t){
		title = t;
	}
	public String getTitle(){
		return title;
	}
	
	public void setPrice(double d){
		price = d;
	}
	public double getPrice(){
		return price;
	}
	
	public String getInfo(){
		return "标题：" + title + "，价格：" +price;
	}
}