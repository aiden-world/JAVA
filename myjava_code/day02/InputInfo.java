public class InputInfo{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("请输入姓名");
		String name = input.next();
		System.out.println("请输入年龄");
		int age = input.nextInt();
		System.out.println("请输入是否已婚(true或false)");
		boolean isMarry = input.nextBoolean();
		System.out.println(name+"今年"+age+"岁，"+(isMarry?"已婚":"未婚"));
	}
}