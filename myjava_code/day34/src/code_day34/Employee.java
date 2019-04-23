package code_day34;

import java.util.Date;

//对应t_employee表的实体类
//mysql             java
//char/varchar      String
//date/dateTime     java.util/sql.date

public class Employee {
	private Integer eid  ; //一般使用包装类,因为表中可能有空值
	private String ename ;
	private String tel;
	private String gender;
	private Double salary;
	private Double commissionPct;
	private Date   birthday;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(Double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Employee() {
		super();
	}
	public Employee(Integer eid, String ename, String tel, String gender, Double salary, Double commissionPct,
			Date birthday) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.tel = tel;
		this.gender = gender;
		this.salary = salary;
		this.commissionPct = commissionPct;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", tel=" + tel + ", gender=" + gender + ", salary="
				+ salary + ", commissionPct=" + commissionPct + ", birthday=" + birthday + "]";
	}
	
	
	
	
}
