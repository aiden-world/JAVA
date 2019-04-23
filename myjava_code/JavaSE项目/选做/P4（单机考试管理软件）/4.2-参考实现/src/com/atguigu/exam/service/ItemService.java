package com.atguigu.exam.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.atguigu.exam.domain.Item;

/**
 * 这个类于管理题库,内中有一个Item数组,用来保存所有的题目
 * 并且提供了一些方法,可以方便地获取某个题目
 * @author Administrator
 *
 */
public class ItemService {
	
	/**
	 * 保存所有的题目
	 */
	private Item[] items;
	
	/**
	 * 构造器,调用readTextFile方法,获取所有题目的集合,把集合里的每一个对象转存到数组中
	 */
	public ItemService() {
		List<Item> list = readTextFile("Items.txt");
		items = new Item[list.size()];
		for (int i = 0 ; i < items.length; i++) {
			items[i] = list.get(i);
		}
	}
	
	/**
	 * 读取指定的文本文件, 然后把其中的内容,每七行构建一个Item对象,
	 * 总共处理11个Item对象,并把这11个对象保存到集合中,并返回
	 * @param fileName 包含题库的文件名
	 * @return 包含了11个题目对象的集合
	 */
	private List<Item> readTextFile(String fileName) {
		FileReader fReader = null;
		BufferedReader bufReader = null;
		List<Item> list = new ArrayList<Item>();
		try {
			// 打开流
			fReader = new FileReader(fileName);
			bufReader = new BufferedReader(fReader);
			// 处理数据
			for (int i = 0; i < 10; i++) {
				// 每次循环处理一个题目对象
				String line1 = bufReader.readLine();//题目
				String line2 = bufReader.readLine();//A
				String line3 = bufReader.readLine();//B
				String line4 = bufReader.readLine();//C
				String line5 = bufReader.readLine();//D
				String line6 = bufReader.readLine();//答案
				String line7 = bufReader.readLine();//这一行要读,但是读到值其实没有什么用.
				Item item = new Item(line1,
									 line2,
									 line3,
									 line4,
									 line5,
									 line6.charAt(0));
				list.add(item);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufReader != null) {
				try {
					bufReader.close();
				} catch (Exception e2) {
				}
			}
		}
		return list;
	}
	
	/**
	 * 提供取题服务, 根据参数传入的给定的题号,把相应的题号对应的题目对象返回
	 * @param no 题号
	 * @return 对应的题目对象
	 */
	public Item getItem(int no) {
		Item item = items[no - 1];
		return item;
	}
	
	/**
	 * 提供保存答案服务,把参数传入的分数值和用户答案的字符数组对象,
	 * 把分数用写基本类型数据的方式写入文件
	 * 使用对象序列化的方式,把对象保存到二进制
	 * 文件answer.dat中去. 
	 * @param answer 字符数组对象
	 */
	public void saveScoreAndAnswer(int score, char[] answer) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			// 打开流
			fos = new FileOutputStream("answer.dat");
			oos = new ObjectOutputStream(fos);
			// 处理数据
			oos.writeInt(score);
			oos.writeObject(answer);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	/**
	 * 提供读取分数服务,需要从二进制文件answer.dat中读取上面的方法保存的那个整数
	 * 并把读到的整数返回
	 * @return 整数
	 */
	public int loadScore() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		int score = 0;
		try {
			//打开流
			fis = new FileInputStream("answer.dat");
			ois = new ObjectInputStream(fis);
			//处理数据
			score = ois.readInt();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e2) {
				}
			}
		}
		return score;
	}
	
	/**
	 * 提供读取字符数组服务,需要从二进制文件answer.dat中读取上面的方法保存的那个数组
	 * 并把读到的数组返回
	 * @return 数组
	 */
	public char[] loadAnswer() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		char[] answer = null;
		try {
			//打开流
			fis = new FileInputStream("answer.dat");
			ois = new ObjectInputStream(fis);
			// 跳过前四个字节是至关重要的!
			ois.readInt();
			// 然后才是字符数组对象
			answer = (char[])ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e2) {
				}
			}
		}
		return answer;
	}
	
	public int getTotalCount() {
		return items.length;
	}
	
	/**
	 * 返回所有的题目的正确答案的数组.
	 * @return
	 */
	public char[] getAllCorrectAnswer() {
		char[] correctAnswer = new char[items.length];
		for (int i = 0; i < items.length; i++) {
			correctAnswer[i] = items[i].getAnswer();
		}
		return correctAnswer;
	}
	
}
