/*
�����в�������main�������ݵĲ���

����Java����
java ���� ʵ��1  ʵ��2  ʵ��3...
�ÿո�ָ�
���磺
java TestCommandParam
java TestCommandParam chai lin yan
�Ƿ���Դ�������
java TestCommandParam 1 2 3
*/
public class TestCommandParam{
	//�βΣ�String[] args
	public static void main(String[] args){
		System.out.println(args);
		System.out.println(args.length);
		
		for(int i=0; i<args.length; i++){
			System.out.println("��" + (i+1) + "��������ֵ�ǣ�" + args[i]);
		}
		
		//���
		int sum = 0;
		for(int i=0; i<args.length; i++){
			//sum += args[i];//�������args[i]��String����
			sum += Integer.parseInt(args[i]);//��Stringת��int
		}
		System.out.println("sum = " + sum);
	}
}
