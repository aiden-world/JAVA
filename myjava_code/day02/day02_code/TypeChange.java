/*
Java���������ͷ�Ϊ��
1��������������
2��������������

һ�������������ͣ�8�֣�
1������ϵ��
byte��1���ֽڣ�,short��2���ֽڣ�,int��4���ֽڣ�,long��8���ֽڣ�
2��������ϵ��
float��4���ֽڣ�,double��8���ֽڣ�
3���ַ���
char��2���ֽڣ�

'a' ->97  'b'->98
'A' ->65   'B'->66
'0' ->48   '1'->49

����ֵ��0-31֮���ǿ��Ʒ�
4��������
boolean

����������������
1����   String,System...
2���ӿ�
3������

���������������͵�ת��
Java ��ǿ��������

1���Զ�����ת��
char
byte-->short-->int -->long -->float-->double
��1���Ѵ洢��ΧС�ĸ�ֵ���洢��Χ��ģ��Զ�����ת��
��2��byte,short,charֻҪ���������㣬�����������Ϊint
��3����������������ͻ�����㣬�Զ�������������������
��4��boolean���Ͳ�����
����
��5��String�����������������+�����㣬������ַ���������ƴ�Ӵ���

2��ǿ������ת��
(ǿ�Ƶ�����)����
��1����Ҫ����ǿ������ת��
double->float->long->int->short->byte
						  char
����з��գ������������ʧ����
��2��boolean���Ͳ�����	
��3��String����ͨ��ǿ������ת��Ϊ������������
��4���е�ʱ���ͨ��ǿ������ת����������ĳ������������
int a = 1;
int b = 2;
System.out.println((double)a / b);				  
*/
class TypeChange{
	public static void main(String[] args){
		/*
		byte b1 = 10;
		int i = b1;//�����int���ұ�byte
		System.out.println(i);
		
		char c = '��';
		int shang = c;
		System.out.println(shang);//�е�Unicode����ֵ
		System.out.println(c);
		
		int a = 200;
		double d = a;
		System.out.println(d);
		
		byte b2 = 10;
		short s2 = b2;
		System.out.println(s2);
		
		char c3 = '��';
		short s3 = c3;
		System.out.println(s3);
		*/
		
		/*
		byte b1 = 1;
		byte b2 = 2;
		//byte b3 = b1 + b2; //�����ݵ�����: ��intת����byte���ܻ�����ʧ
		
		char c1 = 'a';
		char c2 = 'b';
		//char c3 = c1 + c2;//�����ݵ�����: ��intת����char���ܻ�����ʧ
		System.out.println(c1 + c2);//195
		
		char letter1 = 0;//����ֵΪ0���ַ�
		char letter2 = '0';//�ַ�0
		System.out.println(letter1);
		System.out.println(letter2);
		*/
		
		/*
		byte b = 10;
		int i = 200;
		long l = 200000;//�Զ�����ת����200000��intֵ�Զ�תΪlong����
		double d = 25.6;
		System.out.println(b + i + l + d);
		*/
		
		/*
		System.out.println('a' + 'b' + " = ");//'a' + 'b'��ͣ�+" = "ƴ�ӣ�����
		System.out.println('a' + " = " + 'b');//'a' + " = "ƴ�ӣ���������ַ���
		System.out.println(" = " + 'a' + 'b');
		*/
		
		int i = 128;
		byte b = (byte)i;//�����ݵ�����: ��intת����byte���ܻ�����ʧ
		System.out.println(b);
		
		String s = "0";
		//int sNum = (int)s;//�����ݵ�����: String�޷�ת��Ϊint
	}
}