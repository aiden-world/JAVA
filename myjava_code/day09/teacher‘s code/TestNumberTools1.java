/*1����ϰ

��3������һ�����������ܣ�
	���a��b����intֵ�ĺͲ�����
��4������һ�����������ܣ�
	��ð������ʵ�ָ�һ��int[]��һά��������
��5������һ�����������ܣ�
	��һ��x��y�η��������ؽ��
*/
class TestNumberTools1{
	public static void main(String[] args){
		
		NumberTools nl = new NumberTools();
		
		int count = nl.sum(3,5);
		System.out.println("a��b�ĺ��ǣ�"+ count);
		System.out.println("a��b�ĺ��ǣ�"+ count);
		System.out.println("a��b�ĺ��ǣ�"+ count);
		System.out.println("a��b�ĺ��ǣ�"+ count);
		
		
	}

}



class NumberTools{
	
	int sum(int a,int b){
		int he = a +b;
		return he;
	} 


}




