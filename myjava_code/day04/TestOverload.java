
/*
 * ���������أ�overload��
 * Ҫ��1 Ҫ��ͬһ������  2������������ͬ  3�����Ĳ����б�ͬ(1�����ĸ�����ͬ2�������Ͳ�ͬ)
 *     ���������غͷ����ķ���ֵ�����޹�
 */
public class TestOverload {
		
}

class Overload{
	//��������int�����ĺ�
	public int  getSum(int i ,int j) {
		return i+j;
	}
	
	//��������int�ĺ�
	public int getSum(int i ,int j ,int k) {
		return i+j+k;
	}
	//��������double�ĺ�
	public double getSum(double i ,double j) {
		return i+j;
	}
	//��������double��������ĺ�
	public void  getSum(double d1,double d2,double d3) {
		return d1+d2+d3;
	}
	
	
}