public class Change {
	public static void main(String[] args){
		int a=3 ,b=4;
		char c1='A' ,c2='B';
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("c1="+c1+" "+"c2="+c2);
		System.out.println("Let's change it!");
		//����һ  �ṩ��ʱ������ռ�ռ�
		int i1=a;
		a=b;
		b=i1;
	    char c3=c1;
		c1=c2;
		c2=c3;
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("c1="+c1+" "+"c2="+c2);
		//������ ��m��n�ϴ�ʱ���п��ܳ��־�����ʧ
		 a=a-b;
		 b=a+b;//b=b+(a-b)==a;
		 a=b-a;//a=a-(a-b)==b;
         System.out.println("a="+a+" "+"b="+b);
		 //������ �ŵ㣺^�����ţ�û���������ַ�����ȱ�㡣 ȱ�㣺�ѣ�
		 a=a^b;
		 b=a^b;//(a^b)^b==a;
		 a=a^b;//(a^b)^a==b; 
		 System.out.println("a="+a+" "+"b="+b);
		 
		 //60  �ֶ��ķ�ʽ���ӿ���̨���60��ʮ������
		 int i=60;
		 //�Զ�����Integer�෽��
		 String binary = Integer.toBinaryString(i);
		
		System.out.println(binary);

		String hex = Integer.toHexString(i);
		System.out.println(hex);
		 
		int j = i & 15;//��ȡ��i�����4λ��Ӧ��ֵ��
		String k1 = (j <= 9)? j + "" : (char)(j - 10 + 'a') + ""; 
		System.out.println(k1);

		i = i >> 4;
		int z = i & 15;
		String k2 = (z <= 9)? z + "" : (char)(z - 10 + 'a') + "";
		
		System.out.println(k2 + k1);
		
		//x=2,y=2;   x=2,y=1 ; x=7 y=2   ;x=7 y=1
		
	}
}