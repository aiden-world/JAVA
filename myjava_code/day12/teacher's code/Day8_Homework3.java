/*
3������һ���ɷ�Husband�࣬�����������䡢�������ԣ�����˽��
   ����һ������Wife�࣬�����������䡢�ɷ����ԣ�����˽��
   �ɷ�������һ��getInfo���������У�����ʾ�Լ������������䣬���������ӵ�����������
   ����������һ��getInfo���������У�����ʾ�Լ������������䣬�������ɷ������������
   ����һ�������࣬�������Ӻ��ɷ����Ȼ�����
  */
class Day8_Homework3{
	public static void main(String[] args){
		Husband h = new Husband();
		h.setName("�޴�ΰ");
		h.setAge(30);
		
		Wife w = new Wife();
		w.setName("�绨");
		w.setAge(18);
		
		//���
		h.setWife(w);
		w.setHusband(h);
		
		System.out.println(h.getInfo());
		System.out.println(w.getInfo());
	}
}
class Husband{
	private String name;
	private int age;
	private Wife wife;
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	
	public void setWife(Wife w){
		wife = w;
	}
	public Wife getWife(){
		return wife;
	}
	
	public String getInfo(){
		return "�ɷ����Ϣ��������" + name + "�����䣺" + age + "���������ӣ�������" + wife.getName() + "�����䣺" + wife.getAge();
	}
}
class Wife{
	private String name;
	private int age;
	private Husband husband;
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
	
	public void setHusband(Husband h){
		husband = h;
	}
	public Husband getHusband(){
		return husband;
	}
	
	public String getInfo(){
		return "���ӵ���Ϣ��������" + name + "�����䣺" + age + "�������ɷ�������" + husband.getName() + "�����䣺" + husband.getAge();
	}
}