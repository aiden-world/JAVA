	/*
	 * ��Ŀһ��
	 * ��д���򣬶����������ط��������á�������ΪmOL��
	 ���������ֱ����һ��int����������int������һ���ַ����������ֱ�ִ��ƽ�����㲢��������
	 ��˲�������������ַ�����Ϣ��
	 �������main ()�����зֱ��ò��������������������
	 */ 
public class Test1OverLoad {
	public static void main (String[] args){
			mOL t = new mOL();
			
		 System.out.println(t.mOL(2));
		 t.mOL(2,4);
		 t.mOL("����ѩ"); 
		}	 
		
	 }
 class mOL{
		int mOL(int i){
				System.out.println(i*i) ;
				return i*i;
				}
				
			int mOL(int i1 ,int i2){
				System.out.println(i1*i2);
				return i1*i2;
			}
			void mOL(String s){
			System.out.println(s);
			}
	 
	 }
	 
