package project3.domain;

public class NoteBook implements Equipment{
	String model ;
	double  price ;
	public NoteBook(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}
	public NoteBook() {}
	public String getDescription () {
		return model+"("+price+")" ;
	}  

}