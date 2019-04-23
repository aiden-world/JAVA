package project3.service;


import java.util.Arrays;

import project3.domain.*;
public class TeamService {
     private  static int  counter =1;
	 private  final  int  MAX_MEMBER = 5;
	 private  Programmer[] team = new Programmer[MAX_MEMBER];
	 private  int total = 0;

	 public static int getCounter() {
		return counter;
	}
	public int getMAX_MEMBER() {
		return MAX_MEMBER;
	}
	public int getTotal() {
		return total;
	}
	public Programmer[] getTeam() {
		 return team;
		}
	

	 public void addMember(Employee e) throws TeamException{ 
		 if(total==team.length) 
			 throw new TeamException("添加失败,原因: 成员已满,无法添加");
		 if(!(e instanceof Programmer)) 
			 throw new TeamException("添加失败,原因: 该成员不是开发人员，无法添加");
		 if(true) {
			 boolean flag = false ;
			 for (int i = 0; i < team.length; i++) {
				if(team[i]!=null&&e.getId()==team[i].getId()) {
					flag = true;
					break;
				}		
			}
			 if(flag) throw new TeamException("添加失败,原因: 该员已是团队成员 ");
		 }
		 if(((Programmer) e).getStatus().equals(Status.VOCATION)) 
			 throw new TeamException("添加失败,原因: 该员工正在休假，无法添加");
		if(e instanceof Architect) {
		 for (int i = 0; i < team.length; i++) {
				if(team[i] instanceof Architect ) {
					throw new TeamException("添加失败,原因: 团队中只能有一名架构师");
				}		
		 } 
		 }
		if((e instanceof Designer)&&!(e instanceof Architect)) {
			int p = 0;
			 for (int i = 0; i < team.length; i++) {
				 if((team[i] instanceof Designer)&&!(team[i] instanceof Architect)) {
						p++;	
					}
			 }
			if(p==2)
				throw new TeamException("添加失败,原因: 团队中只能有两名设计师");
			 }
		 if((e instanceof Programmer)&&!(e instanceof Designer)) {
				int p = 0;
				 for (int i = 0; i < team.length; i++) {
					 if(( team[i] instanceof Programmer)&&!(team[i]  instanceof Designer)) {
							p++;	
						}
				 }
				if(p==3)
					 throw new TeamException("添加失败,原因: 团队中只能有三名程序员");
				 }
		 
		 for (int i = 0; i < team.length; i++) {
				if(team[i] == null ) {
					team[i] = (Programmer) e;
					total++;
					team[i].setMemberId(counter);
					counter++;
					team[i].setStatus(Status.BUSY);
					System.out.println("添加成功");
					break;
				}
		 }
		 
		
	 }
	 
	 public void removeMember(int memberid) throws TeamException{
		 //由于团队输出排序根据MemberID,因此没有必要进行数组的提前,只需增加成员时碰到null插入即可
		 boolean flag = true ;
		 for(int i = 0 ;i<team.length;i++) {
			 if(memberid<=0||memberid>counter) throw new TeamException("删除失败,团队ID输入错误");
			 if(team[i]!=null&&team[i].getMemberId() == memberid) {
				 team[i].setStatus(Status.FREE);
				 //逻辑一没有进行数组提前,导致打印团队成员没有按照MID升序打印
//				 team[i] = null;
//				 total--;
				 for(int j=i;j<team.length-1;j++) {
					 team[j]=team[j+1];
				 }
					 team[team.length-1]=null;
					 total--;
				 System.out.println("删除成功");
				 flag = false;
				 break;
		 }
	 }
		 if(flag) throw new TeamException("删除失败,团队中没有此人");
	 }

	 
	 public void  printTeamMember() {
		 boolean flag  = false ;
		 System.out.println("--------------------团队成员列表---------------------");
		 for (int i = 0; i < team.length; i++) {
			 if(team[i]!=null) flag  =true;
		 }
		 if(!flag) System.out.println("团队中目前还没有成员");
		 else { System.out.println("TDI/ID"+"\t"+"姓名"+"\t"+"年龄"+"\t"+"工资"+"\t"
					+"职位"+"\t"+"奖金"+"\t"+"股票");
			for (int i = 0; i < team.length; i++) {
			if(team[i]!=null) {		
				int id = team[i].getId();
				String name = team[i].getName();
				int age = team[i].getAge() ;
				double salary = team[i].getSalary();
				String job = "   ";
				String bonus = "   ";
				String stock = "   ";
				if(team[i] instanceof Architect) {
					job = "架构师" ; 
					bonus = String.valueOf(((Architect)team[i]).getBonus());
					stock = String.valueOf(((Architect)team[i]).getStock());
				}
				else if(team[i] instanceof Designer) {
					job = "设计师" ;
					bonus = String.valueOf(((Designer)team[i]).getBonus());
				}
				else if(team[i] instanceof Programmer) {
					job = "程序员";	
				}		
				System.out.println(team[i].getMemberId()+"/"+id+"\t"+name+"\t"+age+"\t"+salary+"\t"
				+job+"\t"+bonus+"\t"+stock);
			}	
			}
			//可以使用冒泡排序来根据TID来打印成员名单,现在在删除逻辑里使用数组元素提前代替
//			int[] arr = new int[5] ;
//			for(int i=0;i<team.length;i++) {
//				if(team[i]!=null) {
//					if(arr[i]<team[i].getMemberId())
//						arr[i]=team[i].getMemberId();
//					}
//				}
//			Arrays.sort(arr);
//			for(int i=0;i<arr.length;i++) {
//				if(arr[i]!=0)
//			for(int i=0;i<team.length;i++) {
//				
//			}
			
			
				
				
			
		 }
		 }
}
	





