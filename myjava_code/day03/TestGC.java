public class TestGC{
	public static void main(String[] args)throws Exception{
		for(int i=0; i<10; i++){
			MyClass m = new MyClass();//���ﱾ��ѭ���꣬���δ����Ķ���ͳ�Ϊ������
			System.out.println("������" + (i+1) + "�Ķ���" + m);
		}
		//֪ͨ�������ջ������ռ�����
		System.gc();
		
		//Ϊ���ӻ��������
		for(int i=0; i<10; i++){
			Thread.sleep(1);
			System.out.println("�����ڼ���....");
		}
	}
}
class MyClass{
	//����������������ջ����ڻ������Ķ���ʱ���Զ����ã����ɶ������������Եķ���
	public void finalize(){
		System.out.println("�����������.....");
	}
}
