/*
1��
��1������һ��ͼ������Book
��2���������ԣ����⡢�۸�
��3������˽�л����ṩget/set����
��4���ṩgetInfo()����
��5���ڲ������У�����Book[]���飬�洢5���飬���Ӽ�������ͼ����Ϣ�������ռ۸�Ӹߵ�������
*/
class Day8_Homework1{
	public static void main(String[] args){
		Book[] array = new Book[5];
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		for(int i=0; i<array.length; i++){
			array[i] = new Book();
			System.out.print("�������" + (i+1) + "����ı��⣺");
			String title = input.next();
			array[i].setTitle(title);
			
			System.out.print("�������" + (i+1) + "����ļ۸�");
			double price = input.nextDouble();
			array[i].setPrice(price);
		}
		
		//�����ռ۸�Ӹߵ�������
		for(int i=1; i<array.length; i++){
			for(int j=0; j<array.length-i; j++){
				if(array[j].getPrice() < array[j+1].getPrice()){
					Book temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		//����
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
		return "���⣺" + title + "���۸�" +price;
	}
}