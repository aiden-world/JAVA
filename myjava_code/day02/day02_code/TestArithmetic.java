/*
�����������
1���ӣ�+
2������-
3���ˣ�*
4������/
	�������������ʱ�����ֻ�����������֡�
	������������ʱ������Ϊ0Ҫ����
	��������С��ʱ������Ϊ0���õ�Infinity
5��ģ��ȡ�ࣩ��%
	(1)Java�в�ֻ��������������С��Ҳ����ȡ����
	(2)ֻ���������ķ��ţ����µ�һ���Ǳ������Ĳ���
	(3)������������ʱ������Ϊ0Ҫ����
	   ��������С��ʱ������Ϊ0���õ�NaN
6������	 +  
   ���� -
7���������Լ�����Ƶ�����⣩
������++  ����1
�Լ���--   �Լ�1

��������������������ʽ
���ۣ�
��1����������������˵������++��ǰ�����ں�����������Ҫ��1
��2�������������ʽ��˵��++��ǰ�����ں��ǲ�һ����
   ++��ǰ����������ȡֵ
   ++�ں���ȡֵ������

*/
class TestArithmetic{
	public static void main(String[] args){
		/*
		System.out.println(5/2);//2
		
		System.out.println(5%2);
		System.out.println(5.2%2.1);
		
		System.out.println(5%2);//1
		System.out.println(-5%2);//-1
		System.out.println(-5%-2);//-1
		System.out.println(5%-2);//1
		
		//System.out.println(5/0);//����ģ����ܱ�0��
		System.out.println(5.0/0);//Infinity  �����
		
		//System.out.println(5%0);
		System.out.println(5.0%0);//NaN  ������  not a number
		
		int a = -5;
		System.out.println(+a);
		System.out.println(-a);
		*/
		
		/*
		int i = 1;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		*/
		
		/*
		int i = 1;
		int j = i++;//++�ں��棬��ȡi��ֵ��Ϊ�������ʽ��ֵ�������㣬Ȼ��i����   i++���ʽ��ֵ��1
		System.out.println(i);//2
		System.out.println(j);//1
		*/
		
		/*
		int i = 1;
		int j = ++i;//++��ǰ�棬��i������Ȼ����ȡi��ֵ��Ϊ���ʽ��ֵ   ++i���ʽ��ֵ��2
		System.out.println(i);//2
		System.out.println(j);//1
		*/
		
		/*
		int i = 1;
		i = i++;//(1)��һ����ȡi��ֵ1��Ϊi++���ʽ��ֵ(2)i������Ϊ2(3)�Ѹղ�i++���ʽ��ֵ1��ֵ��i
		System.out.println(i);//1
		*/
		
		int i = 1;
		i = ++i;
		System.out.println(i);//2
	}
}