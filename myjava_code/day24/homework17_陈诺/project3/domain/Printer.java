package project3.domain;

public class Printer implements Equipment{
	String type ;
	String name ;
	public Printer(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	public Printer() {}
	public String getDescription () {
		return name+"("+type+")" ;
	}  

}