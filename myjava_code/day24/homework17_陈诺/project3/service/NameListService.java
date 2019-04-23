package project3.service;

import project3.domain.*;



public class NameListService {
	private Employee[] employees;
	Equipment[] equipments ;
	
	public Employee[] getEmployees() {
		return employees;
	}

	public Equipment[] getEquipments() {
		return equipments;
	}

	public void initEquipments() {
		 equipments = new Equipment[Data.EQIPMENTS.length] ;
		for (int j = 0; j < Data.EQIPMENTS.length; j++) {
			if(Data.EQIPMENTS[j].length!=0) {
			switch(Data.EQIPMENTS[j][0]) {
			case "21" : 
				equipments[j] = new PC(Data.EQIPMENTS[j][1],Data.EQIPMENTS[j][2]) ;
				break;
			case "22" : 
				equipments[j] = new NoteBook(Data.EQIPMENTS[j][1],
						Double.parseDouble(Data.EQIPMENTS[j][2])) ;
				break;
			case "23" : 
				equipments[j] = new Printer(Data.EQIPMENTS[j][1],Data.EQIPMENTS[j][2]) ;
				break;
			default :
				equipments[j]  = null;
				break;
			}
			}
			else equipments[j]  = null;
		}	
	}
	
	public void initEmployees() {
		employees = new Employee[Data.EMPLOYEES.length] ;
		for (int i = 0; i < Data.EMPLOYEES.length; i++) {
			switch(Data.EMPLOYEES[i][0]) {
			case "10" : 
				employees[i] = new Employee(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2]
						,Integer.parseInt(Data.EMPLOYEES[i][3]),
						Double.parseDouble(Data.EMPLOYEES[i][4]))  ;
				break;
			case "11" : 
				employees[i] = new Programmer(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2]
						,Integer.parseInt(Data.EMPLOYEES[i][3]),
						Double.parseDouble(Data.EMPLOYEES[i][4]),equipments[i])  ;
				break;	
			case "12" : 
				employees[i] = new Designer(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2]
						,Integer.parseInt(Data.EMPLOYEES[i][3]),
						Double.parseDouble(Data.EMPLOYEES[i][4]),equipments[i]
								,Double.parseDouble(Data.EMPLOYEES[i][5]))  ;
				break;
			case "13" : 
				employees[i] = new Architect(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2]
						,Integer.parseInt(Data.EMPLOYEES[i][3]),
						Double.parseDouble(Data.EMPLOYEES[i][4]),equipments[i]
								,Double.parseDouble(Data.EMPLOYEES[i][5])
								,Integer.parseInt(Data.EMPLOYEES[i][6]))  ;
				break;			
			default: 
				employees[i] = null;
				break;				
			}
		}
	}
	
	public NameListService(){		
		initEquipments();
		initEmployees();
	}
	
	public Employee[]  getAllEmployees() {
		return employees;
	}
	
	public Employee getEmployee(int id) throws TeamException{
		for (int i = 0; i < employees.length; i++) {
			if(id == employees[i].getId()) {
				return employees[i] ;
			}
		}
		throw new TeamException("找不到指定的员工");
	}
}
