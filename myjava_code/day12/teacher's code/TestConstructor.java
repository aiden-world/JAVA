/*
��������Ҳ��Ϊ���췽��

1�����ã�
��1����newһ��ʹ�ô�������
��2���ڴ��������ͬʱΪ���Ը�ֵ

2�����������﷨
�﷨�ṹ��
�����η��� ��������(���β��б�){
	//...
}

3�����������ص�
��1����������д����ֵ����
��2�����������ƺ����ڵ�������ȫһ��
��3�������඼�й�����
��4�����һ����û���ֶ���������������ô���������Զ�Ϊ�����һ�����޲ι��족
��5�������Ϊһ�����ֶ���д�˹���������ô�������Ͳ���Ϊ���ṩ���޲ι��족
��6����������������

4������������ʽ
��1���޲ι��죺�ղι���
�����η��� ��������(){
	
}
��2���вι���
�����η��� ��������(�β��б�){
	
}

*/
class TestConstructor{
	public static void main(String[] args){
		//ԭ�������� ������ = new ����();
		//���ڣ����� ������ = new ��������(); 
		//���ߣ����� ������ = new ��������(ʵ���б�); 
		Circle c1 = new Circle();
		
		Circle c2 = new Circle(1.2);
		
		System.out.println(c1.getInfo());
		System.out.println(c2.getInfo());
	}
}

class Circle{
	private double radius;
	
	//���������ͬʱ��Ϊ�뾶��ֵ
	public Circle(double r){
		//�뾶��ֵΪr��ֵ
		radius = r;
	}
	public Circle(){
		//��Ĭ��ֵ
	}
	
	//��������֮��Ϊ�뾶��ֵ�õ�
	public void setRadius(double r){
		radius = r;
	}
	public double getRadius(){
		return radius;
	}
	
	public String getInfo(){
		return "�뾶��" + radius;
	}
}