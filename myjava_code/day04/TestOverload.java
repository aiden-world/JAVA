
/*
 * 方法的重载（overload）
 * 要求：1 要求同一个类中  2方法名必须相同  3方法的参数列表不同(1参数的个数不同2参数类型不同)
 *     方法的重载和方法的返回值类型无关
 */
public class TestOverload {
		
}

class Overload{
	//定义两个int变量的和
	public int  getSum(int i ,int j) {
		return i+j;
	}
	
	//定义三个int的和
	public int getSum(int i ,int j ,int k) {
		return i+j+k;
	}
	//定义两个double的和
	public double getSum(double i ,double j) {
		return i+j;
	}
	//定义三个double类型数组的和
	public void  getSum(double d1,double d2,double d3) {
		return d1+d2+d3;
	}
	
	
}