class TestGraphicTools{
	public static void main(String[] args){
		//第一步：创建GraphicTools的对象
		//类名 对象名 = new 类名();
		GraphicTools gt = new GraphicTools();
		
		//第二步：调用gt对象的printRectangle()方法
		gt.printRectangle(5,10,"*");
		
		System.out.println("-------------------------");
		gt.printRectangle(3,5,"%%");
	}
}