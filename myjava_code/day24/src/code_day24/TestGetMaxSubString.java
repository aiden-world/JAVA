package code_day24;

public class TestGetMaxSubString {
	public static void main(String[] args) {
	String	s1 = "I'd love to have a good look into this big world";
	String	s2 = "love";
	String	s3 = "love my baby";
	String  s4 = "love to have a good look";
	String  s5 = "good";

		System.out.println(getMaxSubString(s1,s2));
		System.out.println(getMaxSubString(s2,s3));
		System.out.println(getMaxSubString(s3,s4));
		System.out.println(getMaxSubString(s1,s4));
		System.out.println(getMaxSubString(s4,s5));
	}
	
	
	
	
	public static String getMaxSubString(String s1 , String s2) {
		String s = s1.length()<=s2.length()?s1:s2;
		String l = s1.length()<=s2.length()?s2:s1;
		//System.out.println("asdas".indexOf("a".substring(1)));  打印结果为0
		String flag =s;
		String result = "";
		for(int i=0;i<s.length();i++) {
		s=s.substring(0, s.length()-i);
		while(s.length()>=1){  
		if(l.indexOf(s)!=-1) {
			if(s.length()>=result.length())
				result=s;
			break;
			} 
		else s=s.substring(1);
		}
		s = flag;
		}
		return result;  //若无匹配输出空字符串
	}
	
}
