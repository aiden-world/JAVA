package project3.service;

import project3.domain.*;
import project3.view.TSUtility;

public class TestError {
public static void main(String[] args) {
	
		 NameListService n = new NameListService();
		System.out.println( n.getAllEmployees()[1].getClass());
		Architect a = (Architect) n.getAllEmployees()[1] ;
		// System.out.println(team[0].getAge()); // 报错空指针
		 System.out.println(( n.getAllEmployees()[1] instanceof Programmer));
		 System.out.println(a.getClass());
		 Architect b = new Architect(0, null, 0, 0, null, 0, 0);
		 System.out.println(b.getClass());
		 b.getStatus();
		 a.getStatus();
		 Programmer c = (Programmer) n.getAllEmployees()[1] ;
		 System.out.println(c);
		 c.getStatus();
		 ((Programmer) n.getAllEmployees()[1]).getStatus();
		 System.out.println( n.getAllEmployees()[1] instanceof Designer);
		 System.out.println("-------------------------------------开发团队调度软件"
					+ "--------------------------------------");
		 Add[] dd = new Add[5];
		 System.out.println(dd[0]);
		 Add ad1 = new Add(5);
		 System.out.println(ad1);
		 dd[0] = ad1;
		 System.out.println(dd[0]);
		 dd[0].i = 3;
		 System.out.println(ad1);
		 dd[0] =null;
		 System.out.println(ad1);
		 
		 System.out.println("按回车键继续");
			TSUtility.readReturn();
		System.out.println("见回头");	
}


//t.enterMainMenu();
//	for (int i = 0; i < 5; i++) {
//		System.out.println(t.getListSvc().getAllEmployees()[i]);
//		System.out.println(t.getListSvc().getEmployee(0));
//
//	}
//String s = String.valueOf(((Architect)t.getListSvc().getAllEmployees()[1]).getEquipment().getDescription());	
//System.out.println(s);


//((Architect)t.getListSvc().getAllEmployees()[1]).getEquipment().getDescription()
	
//	System.out.println(((Architect)t.getListSvc().getAllEmployees()[3]).getEquipment());
//			t.getListSvc().initEquipments();
//			for (int i = 0; i < 6; i++) {
//				System.out.println(t.getListSvc().getEquipments()[1]);
//			}
//			

}

class Add {
	int i ;
	Add(int a) {i = a;}
	Add(){}
	@Override
	public String toString() {return String.valueOf(i) ; }
}
