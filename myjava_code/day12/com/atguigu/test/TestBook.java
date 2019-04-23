package com.atguigu.test;
import com.atguigu.bean.Book;

public class TestBook {
	public static void main(String[] args) {
		Book[] mybook = new Book[2];
		mybook[0] = new Book(1,"Èý¹úÑÝÒå",13.5,4000,10000,"Romance of the Three Kingdoms.jpg") ;
		mybook[1] = new Book();
		mybook[1].setId(2);
		mybook[1].setTitle("ºìÂ¥ÃÎ");;
		mybook[1].setPrice(33.5);
		mybook[1].setSales(6000);
		mybook[1].setStock(14000);
		mybook[1].setImgPath("A Dream in Red Mansions.jpg");
		for (int i = 0; i < mybook.length; i++) {
			mybook[i].getInfo();
		}
	}
}
