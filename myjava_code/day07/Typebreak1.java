
public class Typebreak1 {
	public static void main(String[] args) {
		out:for(int i=2;i<=100;i++) {
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0)  continue out ;
			}
			System.out.println(i);			
		} 			
	}
}
