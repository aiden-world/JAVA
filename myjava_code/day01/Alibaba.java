public class Alibaba {
public static void main(String[] args) {
	//缩进四个空格
	String say = "hello";
	//运算符的左右必须有一个空格
	int flag = 0;
	//关键词if与括号间必须有一个空格。括号内的f与左括号，0与右括号不需空格
	if (flag == 0) {
		System.out.println(say);	
	}
	//左大括号前加空格且不换行，左大括号后换行
	if (flag == 1) {
		System.out.println("world");
	//右大括号前换行，右大括号后有else，不用换行	
	} else {
			System.out.println("OK");
	//右大括号后直接结束，则必须换行
	}
}
}