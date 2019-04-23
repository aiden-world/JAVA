/*
(1)声明一个图形打印工具类GraphicTools
(2)在这个类中，声明一个方法，它的功能是打印一个m行n列的由*组成的矩形
(3)在测试类TestGraphicTools的main方法中调用
*/
class GraphicTools{
	//声明一个方法，它的功能是打印一个m行n列的由xx组成的矩形
	//没有结果用void
	//方法名：打印矩形  printRectangle
	//形参：需要数据辅助，需要指定m行n列
	void printRectangle(int m,int n, String xx){
		//方法体：完成功能
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(xx);
			}
			System.out.println();
		}
	}
}