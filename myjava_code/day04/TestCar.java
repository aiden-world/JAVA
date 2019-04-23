
public class TestCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.info();
		c1.name ="����";
		c1.wheel = 4 ;
		c1.info();
		
		Factory f = new Factory();
		Car c2 = f.producerCar();
		f.describeCar(c2);
		Car c3 = f.producerCar("��ʱ��", 6);
		f.describeCar(c3);
	}
}


class Car{
	//1 ����
	String  name ;
	int wheel;
	
	//2 ����
	public void info() {
		System.out.println("name "+name+" wheel "+wheel);
	}
	public void show() {
		System.out.println("����һ����");
	}
	public String getName() {return name; }
}

class Factory{
	//���쳵(����������������)
	public Car producerCar() {
		return new Car();
	}
	
	public Car producerCar(String n,int i) {
		Car c1 = new Car();
		c1.name = n;
		c1.wheel = i;
		return c1;
	}	
	public void describeCar(Car c) {
		c.info();
	}
}
