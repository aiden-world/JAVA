/*
�������Ļ���������
1����װ
2���̳�
3����̬

һ����װ(Encapsulation)
1��ʲô�Ƿ�װ��
��װ������һЩ���ݣ����ⲻ�ɼ���Ϊ�˰�ȫ�������ⱻ�޸�
	  �����ص����أ��ñ�¶�ı�¶
���磺�����еĿ�ݰ���

���壺���Ե�˽�л�
���壺
 ��1��   �����Է�����ķ�װ��ʹ�õ����߲���Ҫ֪���ڲ���ʵ�֣���¶����ǩ��
			���磺Math.sqrt(xx)��System.out.println(xx)

�����η��� ����ֵ����  ������(���β��б�){
	������
}
����ͷ������ǩ���������η��� ����ֵ����  ������(���β��б�)
�����壺{}

��2��������ԡ������ȵķ�װ
��3������ķ�װ
��4��ϵͳ�ķ�װ

2�����Եķ�װ
��1�����Ե�˽�л�
private �������� ������;

һ��˽�л���ֻ�ܱ�����ʹ�á�

��2���������ṩ������get/set����
getϵ�У�������ȡֵ�õ�
setϵ�У����������ֵ�õ�

get/set������������Ҫ��get/set+������������������ĸ��д����Ϊ�������ڶ�����������ĸ��д��			

Ϊʲô����Ҫ˽�л���
��Ϊϣ������ͨ��get/set�������Եķ��ʡ�
�����˽�л�������߾�ʧȥ�˶����ԵĿ��ơ�			
*/
class TestEncapsulation{
	public static void main(String[] args){
		//���ʹ����
		Circle c = new Circle();
		//c.radius = -1;
		//System.out.println("c�İ뾶��" + c.radius);//����ģ���Ϊradius˽����
		System.out.println("c�İ뾶��" + c.getRadius());
		
		c.setRadius(2.0);
		System.out.println("c�İ뾶��" + c.getRadius());
	}
}

//������������壬���
class Circle{
	private double radius;
	
	//������ȡradius��ֵ
	public double getRadius(){
		return radius;
	}
	
	//������޸�radius��ֵ
	public void setRadius(double r){
		if(r>=0){
			radius = r;
		}
	}
}