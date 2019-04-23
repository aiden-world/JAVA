package project3.domain;

public class PC implements Equipment{
	String model ;
	String display ;
	public PC(String model, String display) {
		super();
		this.model = model;
		this.display = display;
	}
	public PC() {}
	public String getDescription () {
		return model+"("+display+")" ;
	}  
	
}