/*
��ĳ�Ա��
��1�����ԣ���Ա����
��2����������Ա����
��3��������

this����ǰ����

���壺
��1�����this�����ڹ������У����ڴ����Ķ���
��2�����this�����ڳ�Ա�����У����ڵ��ø÷����Ķ���

ʲô�������Ҫ�õ�this��
��1��this.����
���ֲ�������ʵ�����������ԣ�ͬ��ʱ��������ʵ��������ǰ��ӡ�this.����  ---����Ҫ�Ǳ����õĵط�
���û�оֲ�������ʵ������ͬ�����⣬��ȫ����ʡ������ǰ���"this."��

��2��this.����
�ڳ�Ա�����з��ʱ����������Ա����ʱ�����Լ�"this."��������ȫ����ʡ��"this."

��3��this()��this(ʵ���б�)
this()��ʾ���ñ�����޲ι���
this(ʵ���б�)��ʾ���ñ�����вι���

Ҫ�󣺱����ڹ�����������

*/
class TestThis{
	public static void main(String[] args){
		Circle c = new Circle(1.2);//����Բ�����ͬʱΪ�뾶��ֵΪ1.2
		System.out.println(c.getInfo());
		
		/*
		����ϣ��������ͨ���޲ι��컹���вι��죬������Բ�����ڴ���ʱ������ӡһ�仰����һ��Բ���ڱ�����...��
		*/
		Circle c2 = new Circle();
	}
}

class Circle{
	private double radius;
	
	//�޲ι���
	public Circle(){
		System.out.println("һ��Բ���ڱ�����...");
	}
	
	//�вι���
	//����������Ӧ�ü���֪�⣬��double r���βΣ��β�Ҳ�Ǳ�����ҲӦ�ü���֪��
	//double r�����þ���Ϊradius��ֵ�õģ�����ֵ���ǰ뾶��ֵ
	public Circle(double radius){
		this();
		this.radius = radius;		
	}
	
	public double getArea(){
		return 3.14 * radius * radius;
	}
	
	public String getInfo(){
		//return "�뾶��" + this.radius + "�������" + this.getArea();
		return "�뾶��" + radius + "�������" + getArea();
	}
}

class Customer{
	private String name;
	private String cardId;
	private String tel;
	private String address;
	
	//�޲ι���
	public Customer(){
		
	}
	//�����˿Ͷ���ʱ��Ϊ���������֤�Ÿ�ֵ
	public Customer(String name, String cardId){
		this();//��������ĵ�һ���޲ι���
		this.name = name;
		this.cardId = cardId;
	}
	
	public Customer(String name, String cardId,String tel, String address){
		this(name,cardId);//��������ĵڶ������������вι���
		//this.name = name;
		//this.cardId = cardId;
		this.tel = tel;
		this.address = address;
	}