package project3.view;

import project3.view.TSUtility;
import project3.domain.*;
import project3.service.*;

public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	public NameListService getListSvc() {
		return listSvc;
	}
	public TeamService getTeamSvc() {
		return teamSvc;
	}
	
//	public  static void  main(String[] args) {
//		
//		enterMainMenu();
//		
//	}
	
	
	
	public  void  enterMainMenu()   {
		try {
			listAllEmployees();
		} catch (TeamException e) {
			TSUtility.readReturn();
			enterMainMenu() ;
		}	
	}
	
	public void printEmployeesList(){
		System.out.println("-------------------------------------开发团队调度软件"
				+ "--------------------------------------");
		System.out.println("ID"+"\t"+"姓名"+"\t"+"年龄"+"\t"+"工资"+"\t"
				+"职位"+"\t"+"状态"+"\t"+"奖金"+"\t"+"股票"+"\t"+"领用设备");
		for (int i = 0; i < listSvc.getAllEmployees().length; i++) {
			int id = listSvc.getAllEmployees()[i].getId();
			String name = listSvc.getAllEmployees()[i].getName();
			int age = listSvc.getAllEmployees()[i].getAge() ;
			double salary = listSvc.getAllEmployees()[i].getSalary();
			String nowStatus = "   ";
			String job = "   ";
			String bonus = "   ";
			String stock = "   ";
			String equip = "   " ;
			if(listSvc.getAllEmployees()[i] instanceof Architect) {
				job = "架构师" ; 
				nowStatus = ((Architect)listSvc.getAllEmployees()[i]).getStatus().name();
				bonus = String.valueOf(((Architect)listSvc.getAllEmployees()[i]).getBonus());
				stock = String.valueOf(((Architect)listSvc.getAllEmployees()[i]).getStock());
				equip = String.valueOf(((Architect)listSvc.getAllEmployees()[i]).getEquipment().getDescription());	
			}
			else if(listSvc.getAllEmployees()[i] instanceof Designer) {
				job = "设计师" ;
				nowStatus = ((Designer)listSvc.getAllEmployees()[i]).getStatus().name();
				bonus = String.valueOf(((Designer)listSvc.getAllEmployees()[i]).getBonus());
				equip = String.valueOf(((Designer)listSvc.getAllEmployees()[i]).getEquipment().getDescription());	
			}
			else if(listSvc.getAllEmployees()[i] instanceof Programmer) {
				job = "程序员";	
				nowStatus = ((Programmer)listSvc.getAllEmployees()[i]).getStatus().name();	
				equip = String.valueOf(((Programmer)listSvc.getAllEmployees()[i]).getEquipment().getDescription());	
			}
			
			System.out.println(id+"\t"+name+"\t"+age+"\t"+salary+"\t"
			+job+"\t"+nowStatus+"\t"+bonus+"\t"+stock+"\t"+equip);
		}
	}
	
	
	

	private void  listAllEmployees() throws TeamException {
		printEmployeesList();
		System.out.println("------------------------------------------------------"
				+ "---------------------------------------------");
		System.out.println("1-团队列表   2-添加团队成员   3-删除团队成员  4-退出    请选择(1-4)： ");
		char c = TSUtility.readMenuSelection() ;
		switch(c) {
		case '1': 
			teamSvc.printTeamMember();
			TSUtility.readReturn();
			listAllEmployees();
		case '2':  
			printEmployeesList();
			addMember();
			TSUtility.readReturn();
			listAllEmployees();
		case '3': 
			teamSvc.printTeamMember();
			deleteMember();
			TSUtility.readReturn();
			listAllEmployees();
		case '4':
			System.out.println("请确认是否要退出(Y/N)");
			char d = TSUtility.readConfirmSelection();
			if(d =='Y') break;
			else listAllEmployees(); 
		}
	}	
	
	
	
	private void  addMember() throws TeamException {
		System.out.println("---------------------添加成员---------------------");
		System.out.println("请输入要添加的员工ID： ");
		int k1 = TSUtility.readInt();
		if(k1<=0||k1>listSvc.getAllEmployees().length) {
			throw new TeamException("员工ID输入错误");
		}
		teamSvc.addMember(listSvc.getAllEmployees()[k1-1]);
	}
	
	private void  deleteMember() throws TeamException {
		System.out.println("请输入要删除的员工的TID:");
		int k2 = TSUtility.readInt();
		teamSvc.removeMember(k2);
	}
	
	
}


