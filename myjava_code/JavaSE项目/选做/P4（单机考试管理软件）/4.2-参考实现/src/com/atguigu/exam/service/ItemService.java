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
 * ������ڹ������,������һ��Item����,�����������е���Ŀ
 * �����ṩ��һЩ����,���Է���ػ�ȡĳ����Ŀ
 * @author Administrator
 *
 */
public class ItemService {
	
	/**
	 * �������е���Ŀ
	 */
	private Item[] items;
	
	/**
	 * ������,����readTextFile����,��ȡ������Ŀ�ļ���,�Ѽ������ÿһ������ת�浽������
	 */
	public ItemService() {
		List<Item> list = readTextFile("Items.txt");
		items = new Item[list.size()];
		for (int i = 0 ; i < items.length; i++) {
			items[i] = list.get(i);
		}
	}
	
	/**
	 * ��ȡָ�����ı��ļ�, Ȼ������е�����,ÿ���й���һ��Item����,
	 * �ܹ�����11��Item����,������11�����󱣴浽������,������
	 * @param fileName ���������ļ���
	 * @return ������11����Ŀ����ļ���
	 */
	private List<Item> readTextFile(String fileName) {
		FileReader fReader = null;
		BufferedReader bufReader = null;
		List<Item> list = new ArrayList<Item>();
		try {
			// ����
			fReader = new FileReader(fileName);
			bufReader = new BufferedReader(fReader);
			// ��������
			for (int i = 0; i < 10; i++) {
				// ÿ��ѭ������һ����Ŀ����
				String line1 = bufReader.readLine();//��Ŀ
				String line2 = bufReader.readLine();//A
				String line3 = bufReader.readLine();//B
				String line4 = bufReader.readLine();//C
				String line5 = bufReader.readLine();//D
				String line6 = bufReader.readLine();//��
				String line7 = bufReader.readLine();//��һ��Ҫ��,���Ƕ���ֵ��ʵû��ʲô��.
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
	 * �ṩȡ�����, ���ݲ�������ĸ��������,����Ӧ����Ŷ�Ӧ����Ŀ���󷵻�
	 * @param no ���
	 * @return ��Ӧ����Ŀ����
	 */
	public Item getItem(int no) {
		Item item = items[no - 1];
		return item;
	}
	
	/**
	 * �ṩ����𰸷���,�Ѳ�������ķ���ֵ���û��𰸵��ַ��������,
	 * �ѷ�����д�����������ݵķ�ʽд���ļ�
	 * ʹ�ö������л��ķ�ʽ,�Ѷ��󱣴浽������
	 * �ļ�answer.dat��ȥ. 
	 * @param answer �ַ��������
	 */
	public void saveScoreAndAnswer(int score, char[] answer) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			// ����
			fos = new FileOutputStream("answer.dat");
			oos = new ObjectOutputStream(fos);
			// ��������
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
	 * �ṩ��ȡ��������,��Ҫ�Ӷ������ļ�answer.dat�ж�ȡ����ķ���������Ǹ�����
	 * ���Ѷ�������������
	 * @return ����
	 */
	public int loadScore() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		int score = 0;
		try {
			//����
			fis = new FileInputStream("answer.dat");
			ois = new ObjectInputStream(fis);
			//��������
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
	 * �ṩ��ȡ�ַ��������,��Ҫ�Ӷ������ļ�answer.dat�ж�ȡ����ķ���������Ǹ�����
	 * ���Ѷ��������鷵��
	 * @return ����
	 */
	public char[] loadAnswer() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		char[] answer = null;
		try {
			//����
			fis = new FileInputStream("answer.dat");
			ois = new ObjectInputStream(fis);
			// ����ǰ�ĸ��ֽ���������Ҫ��!
			ois.readInt();
			// Ȼ������ַ��������
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
	 * �������е���Ŀ����ȷ�𰸵�����.
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
