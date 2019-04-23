
public class DaffodilNum {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int i1 = i/100;
			int i2 = (i/10)%10;
			int i3 = i%10 ;
			if(Cube(i1)+Cube(i2)+Cube(i3)==i) System.out.println(i);
		}
	}
	static int Cube(int i){
		 return i*i*i;
	}
}
