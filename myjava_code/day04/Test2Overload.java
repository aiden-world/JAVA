//��Ŀ����
//	�����������ط���max()����һ������������intֵ�е����ֵ��
//	�ڶ�������������doubleֵ�е����ֵ��
//	����������������doubleֵ�е����ֵ�����ֱ��������������
public class Test2Overload {
	public static void main(String[] args) {
		System.out.println(max(3,4));
		System.out.println(max(3.1,2.6));
		System.out.println(max(3.2,4.1,9.9));
		
	}
	public static int max(int i,int j) {
		return i>j?i:j;
	}
	public static double max (double  i , double j) {
		return i>j?i:j;
	}
	public static double max (double  i , double j,double  k) {
		return i>=j&&i>=k?i:(j>=i&&j>=k?j:k);
	}
	
}
