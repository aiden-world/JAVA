/*
(1)����һ��ͼ�δ�ӡ������GraphicTools
(2)��������У�����һ�����������Ĺ����Ǵ�ӡһ��m��n�е���*��ɵľ���
(3)�ڲ�����TestGraphicTools��main�����е���
*/
class GraphicTools{
	//����һ�����������Ĺ����Ǵ�ӡһ��m��n�е���xx��ɵľ���
	//û�н����void
	//����������ӡ����  printRectangle
	//�βΣ���Ҫ���ݸ�������Ҫָ��m��n��
	void printRectangle(int m,int n, String xx){
		//�����壺��ɹ���
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(xx);
			}
			System.out.println();
		}
	}
}