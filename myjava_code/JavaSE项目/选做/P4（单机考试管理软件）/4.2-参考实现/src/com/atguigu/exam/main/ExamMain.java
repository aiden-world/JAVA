package com.atguigu.exam.main;

import com.atguigu.exam.service.ItemService;
import com.atguigu.exam.view.ExamView;

public class ExamMain {
	
	public static void main(String[] args) {
		ItemService service = new ItemService();
		ExamView view = new ExamView(service); //�������,ʹ�ù��������ݶ���.
		view.testExam();
	}
}
