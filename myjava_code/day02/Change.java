public class Change {
	public static void main(String[] args){
		int a=3 ,b=4;
		char c1='A' ,c2='B';
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("c1="+c1+" "+"c2="+c2);
		System.out.println("Let's change it!");
		//方法一  提供临时变量，占空间
		int i1=a;
		a=b;
		b=i1;
	    char c3=c1;
		c1=c2;
		c2=c3;
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("c1="+c1+" "+"c2="+c2);
		//方法二 当m和n较大时，有可能出现精度损失
		 a=a-b;
		 b=a+b;//b=b+(a-b)==a;
		 a=b-a;//a=a-(a-b)==b;
         System.out.println("a="+a+" "+"b="+b);
		 //方法三 优点：^异或符号，没有上面两种方法的缺点。 缺点：难！
		 a=a^b;
		 b=a^b;//(a^b)^b==a;
		 a=a^b;//(a^b)^a==b; 
		 System.out.println("a="+a+" "+"b="+b);
		 
		 //60  手动的方式，从控制台输出60的十六进制
		 int i=60;
		 //自动调用Integer类方法
		 String binary = Integer.toBinaryString(i);
		
		System.out.println(binary);

		String hex = Integer.toHexString(i);
		System.out.println(hex);
		 
		int j = i & 15;//获取到i的最低4位对应的值。
		String k1 = (j <= 9)? j + "" : (char)(j - 10 + 'a') + ""; 
		System.out.println(k1);

		i = i >> 4;
		int z = i & 15;
		String k2 = (z <= 9)? z + "" : (char)(z - 10 + 'a') + "";
		
		System.out.println(k2 + k1);
		
		//x=2,y=2;   x=2,y=1 ; x=7 y=2   ;x=7 y=1
		
	}
}