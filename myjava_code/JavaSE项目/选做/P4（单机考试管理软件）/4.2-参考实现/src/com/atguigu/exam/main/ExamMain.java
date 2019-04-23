package com.atguigu.exam.main;

import com.atguigu.exam.service.ItemService;
import com.atguigu.exam.view.ExamView;

public class ExamMain {
	
	public static void main(String[] args) {
		ItemService service = new ItemService();
		ExamView view = new ExamView(service); //对象关联,使用构造器传递对象.
		view.testExam();
	}
}
