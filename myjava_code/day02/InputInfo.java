public class InputInfo{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("����������");
		String name = input.next();
		System.out.println("����������");
		int age = input.nextInt();
		System.out.println("�������Ƿ��ѻ�(true��false)");
		boolean isMarry = input.nextBoolean();
		System.out.println(name+"����"+age+"�꣬"+(isMarry?"�ѻ�":"δ��"));
	}
}