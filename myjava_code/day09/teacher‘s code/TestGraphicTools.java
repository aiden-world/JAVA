class TestGraphicTools{
	public static void main(String[] args){
		//��һ��������GraphicTools�Ķ���
		//���� ������ = new ����();
		GraphicTools gt = new GraphicTools();
		
		//�ڶ���������gt�����printRectangle()����
		gt.printRectangle(5,10,"*");
		
		System.out.println("-------------------------");
		gt.printRectangle(3,5,"%%");
	}
}