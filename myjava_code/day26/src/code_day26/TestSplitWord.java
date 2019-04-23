package code_day26;

public class TestSplitWord {
	public static void main(String[] args) {
		String str = "1.hello2.world3.java4.string";
		SplitWord(str);
		SplitWord1(str);
		SplitWord2(str);

	}
	
	
	static void  SplitWord(String str) {
		String[] s=str.split("\\d");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].replaceAll("\\W", ""));
		}	
	}
	static void  SplitWord1(String str) {
		String str1 = str.replaceFirst("^\\d\\.", "");
		 String[] s=str1.split("\\d\\.");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	static void  SplitWord2(String str) {
		 str = str.replaceAll("[^a-zA-Z]", "-");
		 String[] s=str.split("-+");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		
	}
	
}


