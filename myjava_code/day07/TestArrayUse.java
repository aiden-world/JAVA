/*
���������ʹ��
1���������Ҫ�أ�
��1����������
��һ����˼���������������   ��Ϊ������������������
�ڶ�����˼�������Ԫ�ص���������   �������ǻ����������ͣ�Ҳ������������������
��2��������  
��3������ĳ���
��4�������Ԫ�ص�ֵ
   �����Ԫ�����û�и�ֵ����ô����һ��Ĭ��ֵ��
   Ԫ���ǻ����������ͣ�
   byte,short,int,long��0
   float,double��0.0
   char�� \u0000��ʾASCIIֵ/Unicode����ֵΪ0���ַ���һ�����ַ�
   boolean��false
   Ԫ���������������ͣ�null
   

2�������ʹ��
��1�����������
	�����Ԫ�ص�����[]  ������;
	���磺int[] scores;
		  char[] letters;
		  String[] names;
		  double[] weights;
		  ...
��2��ȷ������ĳ���  -->���ڴ�������һ����ռ�
	������ = new �����Ԫ������[����];

��3�������Ԫ�ظ�ֵ
	������[�±�] = ֵ;
	
��4�����������Ԫ�ص�ֵ	
		  
���䣺
��������Ҫ�أ��������͡�������������ֵ
������������
	�������� ������;
	���磺int age;
		  int score;
		  char c;
		  String str;
		  ...
*/
class TestArrayUse{
	public static void main(String[] args){
		//��һ������洢5��ͬѧ�ĳɼ�
		//(1)����һ������
		int[] scores;
		//(2)ȷ������ĳ���
		scores = new int[5];
		//��3��ΪԪ�ظ�ֵ��һ��һ����
		scores[0] = 89;
		scores[1] = 80;
		scores[2] = 67;
		scores[3] = 87;
		scores[4] = 90;
		
		System.out.println("��һ��ͬѧ�ĳɼ���" + scores[0]);
		//����ͬѧ�ĳɼ�
		System.out.println("����ѧ���ĳɼ���");
		for(int i=0; i<5; i++){
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
		//��һ������洢26��Ӣ��Сд��ĸ
		//��1����������
		char[] letters;
		//��2��ȷ������ĳ���
		letters = new char[26];
		//��3��ΪԪ�ظ�ֵ������ͨ��forѭ��
		for(int i=0; i<26; i++){
			letters[i] = (char)('a' + i);
		}
		System.out.println("���е�Сд��ĸ��");
		for(int i=0; i<26; i++){
			System.out.print(letters[i] + " ");
		}
		
		//����洢ΰ��������
		String[] famouspeople = new String[4];
		famouspeople[0] = "ë��";
		famouspeople[1] = "��Сƽ";
		famouspeople[2] = "�ܶ���";
		famouspeople[3] = "ϰ��ƽ";
		for(int i =0;i<famouspeople.length;i++) {
			System.out.println(famouspeople[i]);
		}		
						
		}
	}





