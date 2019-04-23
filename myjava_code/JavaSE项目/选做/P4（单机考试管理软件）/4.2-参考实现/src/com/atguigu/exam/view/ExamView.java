package com.atguigu.exam.view;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.atguigu.exam.domain.Item;
import com.atguigu.exam.service.ItemService;

public class ExamView {
	
	private ItemService service;
	private char[] answer;
	
	public ExamView(ItemService service) {
		this.service = service;
		this.answer = new char[service.getTotalCount()];
	}
	
	public void setSerive(ItemService service) {
		this.service = service;
	}
	
	public ItemService getService() {
		return service;
	}
	
	public void testExam() {
		while (true) {
			// 打印主菜单. 当用户键入1, 进入考试 
			System.out.println("考试系统主菜单");
			System.out.println("1 进入考试.");
			System.out.println("2 显示上次成绩和答案.");
			System.out.print("请输入(1-2) : ");
			char c = getUserAction();
			if (c == '1') {
				break;
			} else if (c == '2') {
				// 当用户键入2,显示上次的成绩和答案
				// 通过调用loadScore(),loadAnswer()方法获取数据
				System.out.println("上次成绩:" + service.loadScore());
				System.out.print("上次答案:");
				char[] carr = service.loadAnswer();
				for (char a : carr) {
					System.out.print(a + " ");
				}
				System.out.println();
			} else {
				// 当用户输入其他选项时,提示错误!
				System.out.println("输入有误!");
			}
		}
		
		// 打印帮助信息,尤其是各个按键的作用!
		System.out.println("欢迎进入考试系统");
		System.out.println("按键定义如下:");
		System.out.println("N 下一题  P 上一题  A,B,C,D 作出选择.");
		while (true) {
			System.out.println("键入N开始考试");
			// 当键入n时，显示第一道题；
			char op = getUserAction();
			if (op == 'N') {
				break;
			}
		}
		
		int currentNo = 1;
		//初始时，调用 displayItem显示考题第1题；
		displayItem(currentNo);
		while (true) {
			//调用 getUserAction方法，判断当用户键入n时，显示下一题；
			char ch = getUserAction();
			if (ch == 'N') {//在当前为最后一题时键入n，方法结束并返回。
				// 表明到了最后一题
				if (currentNo == service.getTotalCount()) {
					System.out.println("已经是最后一题了!");
				} else {
					currentNo++;//让当前题号变成下一个题题号
					displayItem(currentNo); // 再显示这个题目内容
				}
			} else if (ch == 'P') {//当用户键入p时，显示上一题（如果当前不是第1题时）
				if (currentNo > 1) {
					currentNo--;//让当前题号变成上一个题题号
					displayItem(currentNo);// 再显示这个题目内容
				} else {
					System.out.println("当前已经是第一题了!");
				}
			} else if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D') { //当用户输入ABCD时,把用户的输入作为用户答案,保存在字符数组中
				answer[currentNo - 1] = ch;
				// 每做完一道题,自动跳到下一题
				if (currentNo == service.getTotalCount()) {
					System.out.println("已经是最后一题了!");
				} else {
					currentNo++;//让当前题号变成下一个题题号
					displayItem(currentNo); // 再显示这个题目内容
				}
			} else if (ch == 'F') {
				// 询问用户是否真的结束考试,如果用户执意要结束,用户必须输入Y,然后结束考试
				System.out.println("您真的要结束了吗?请输入(Y/N)");
				ch = getUserAction();
				if (ch == 'Y') {
					break;
				}
			}
		}
		// 判分,并保存用户分数和答案
		calcScore();
	}
	
	/**
	 * 根据正确答案和用户答案作对比,自动判分,并且保存用户的成绩和用户的答案.
	 */
	private void calcScore() {
		// 判分,保存分数和用户答案
		// 1 先获取题库中的所有正确答案数组
		char[] correctAnswer = service.getAllCorrectAnswer();
		// 2把正确答案打印输出
		System.out.print("正确答案  : ");
		for (char c : correctAnswer) {
			System.out.print(c + " ");
		}
		System.out.println();
		// 3把用户答案打印输出
		System.out.print("用户答案  : ");
		for (char c : answer) {
			System.out.print(c + " ");
		}
		System.out.println();
		// 4 使用循环把正确答案数组和用户答案数组作比对,如果用户答案和正确答案相同,则加分!!
		double score = 0;
		for (int i = 0; i < answer.length; i++) {
			if (correctAnswer[i] == answer[i]) { // 这道题做对了
				score += (double)100 / answer.length;
			}
		}
		System.out.println("您的分数是:" + Math.round(score));
		// 5调用saveScoreAndAnswer方法保存分数和答案
		service.saveScoreAndAnswer((int)Math.round(score), answer);
	}
	
	/**
	 * 根据给定的题号,显示题号对应的题目对象的内容
	 * @param no 题号
	 */
	public void displayItem(int no) {
		// 根据题号,向service对象,请求题目对象
		Item item = service.getItem(no);
		// 拿到对象以后,打印输出
		System.out.println(item);
		// 在显示每题题目的同时，如果之前考生已经选择了该题目的答案，则答案也同时显示以便考生查看；
		if (answer[no - 1] != 0) {
			System.out.println("您之前的答案 :" + answer[no - 1]);
		}
	}
	
	/**
	 * 用来获取用户从键盘输入的信息,把用户输入的字符串中的第一个字符返回
	 * 并且返回的字符必须是ABCDNPF中的一个.
	 * @return ABCDNPF中的一个
	 */
	public char getUserAction() {
		InputStream is = System.in;
		InputStreamReader isr = null;
		BufferedReader bufReader = null;
		try {
			isr = new InputStreamReader(is);
			bufReader = new BufferedReader(isr);
			String line = bufReader.readLine();
			while (line != null) {
				// 处理已经读好的字符串
				// 变成大写便于统一处理
				line = line.toUpperCase();
				char firstChar = line.charAt(0);
				if (firstChar == 'A' || 
					firstChar == 'B' ||
					firstChar == 'C' ||
					firstChar == 'D' ||
					firstChar == 'N' ||
					firstChar == 'P' ||
					firstChar == 'F' ||
					firstChar == 'Y' ||
					firstChar == '1' ||
					firstChar == '2') {
					
					return firstChar;
				} else {
					System.out.println("您的输入有误,请输入ABCDNPF中的一个!");
				}
				// 继续读下一行,直到ctrl+z导致null的返回
				line = bufReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
