package com.atguigu.bean;

public class Book {
	private Integer id; 
    private String  title; 
    private double  price; 
    private Integer sales; 
    private Integer stock;
    private String imgPath = "static/img/default.jpg" ;
    		
	public Book() {
		super();
	}

	public Book(Integer id, String title, double price, Integer sales, Integer stock, String imgPath) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.sales = sales;
		this.stock = stock;
		this.imgPath = imgPath;
	}
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public void getInfo() {
		System.out.println("id: "+this.getId() + ",title:" + this.getTitle() + ", price:" + this.getPrice()
				+ ",sales:" + this.getSales() + " ,stock:" + this.getStock() + ",imgPath:" + this.getImgPath());

	}
}