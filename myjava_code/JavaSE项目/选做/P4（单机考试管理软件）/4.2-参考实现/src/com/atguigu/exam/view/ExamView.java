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
			// ��ӡ���˵�. ���û�����1, ���뿼�� 
			System.out.println("����ϵͳ���˵�");
			System.out.println("1 ���뿼��.");
			System.out.println("2 ��ʾ�ϴγɼ��ʹ�.");
			System.out.print("������(1-2) : ");
			char c = getUserAction();
			if (c == '1') {
				break;
			} else if (c == '2') {
				// ���û�����2,��ʾ�ϴεĳɼ��ʹ�
				// ͨ������loadScore(),loadAnswer()������ȡ����
				System.out.println("�ϴγɼ�:" + service.loadScore());
				System.out.print("�ϴδ�:");
				char[] carr = service.loadAnswer();
				for (char a : carr) {
					System.out.print(a + " ");
				}
				System.out.println();
			} else {
				// ���û���������ѡ��ʱ,��ʾ����!
				System.out.println("��������!");
			}
		}
		
		// ��ӡ������Ϣ,�����Ǹ�������������!
		System.out.println("��ӭ���뿼��ϵͳ");
		System.out.println("������������:");
		System.out.println("N ��һ��  P ��һ��  A,B,C,D ����ѡ��.");
		while (true) {
			System.out.println("����N��ʼ����");
			// ������nʱ����ʾ��һ���⣻
			char op = getUserAction();
			if (op == 'N') {
				break;
			}
		}
		
		int currentNo = 1;
		//��ʼʱ������ displayItem��ʾ�����1�⣻
		displayItem(currentNo);
		while (true) {
			//���� getUserAction�������жϵ��û�����nʱ����ʾ��һ�⣻
			char ch = getUserAction();
			if (ch == 'N') {//�ڵ�ǰΪ���һ��ʱ����n���������������ء�
				// �����������һ��
				if (currentNo == service.getTotalCount()) {
					System.out.println("�Ѿ������һ����!");
				} else {
					currentNo++;//�õ�ǰ��ű����һ�������
					displayItem(currentNo); // ����ʾ�����Ŀ����
				}
			} else if (ch == 'P') {//���û�����pʱ����ʾ��һ�⣨�����ǰ���ǵ�1��ʱ��
				if (currentNo > 1) {
					currentNo--;//�õ�ǰ��ű����һ�������
					displayItem(currentNo);// ����ʾ�����Ŀ����
				} else {
					System.out.println("��ǰ�Ѿ��ǵ�һ����!");
				}
			} else if (ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D') { //���û�����ABCDʱ,���û���������Ϊ�û���,�������ַ�������
				answer[currentNo - 1] = ch;
				// ÿ����һ����,�Զ�������һ��
				if (currentNo == service.getTotalCount()) {
					System.out.println("�Ѿ������һ����!");
				} else {
					currentNo++;//�õ�ǰ��ű����һ�������
					displayItem(currentNo); // ����ʾ�����Ŀ����
				}
			} else if (ch == 'F') {
				// ѯ���û��Ƿ���Ľ�������,����û�ִ��Ҫ����,�û���������Y,Ȼ���������
				System.out.println("�����Ҫ��������?������(Y/N)");
				ch = getUserAction();
				if (ch == 'Y') {
					break;
				}
			}
		}
		// �з�,�������û������ʹ�
		calcScore();
	}
	
	/**
	 * ������ȷ�𰸺��û������Ա�,�Զ��з�,���ұ����û��ĳɼ����û��Ĵ�.
	 */
	private void calcScore() {
		// �з�,����������û���
		// 1 �Ȼ�ȡ����е�������ȷ������
		char[] correctAnswer = service.getAllCorrectAnswer();
		// 2����ȷ�𰸴�ӡ���
		System.out.print("��ȷ��  : ");
		for (char c : correctAnswer) {
			System.out.print(c + " ");
		}
		System.out.println();
		// 3���û��𰸴�ӡ���
		System.out.print("�û���  : ");
		for (char c : answer) {
			System.out.print(c + " ");
		}
		System.out.println();
		// 4 ʹ��ѭ������ȷ��������û����������ȶ�,����û��𰸺���ȷ����ͬ,��ӷ�!!
		double score = 0;
		for (int i = 0; i < answer.length; i++) {
			if (correctAnswer[i] == answer[i]) { // �����������
				score += (double)100 / answer.length;
			}
		}
		System.out.println("���ķ�����:" + Math.round(score));
		// 5����saveScoreAndAnswer������������ʹ�
		service.saveScoreAndAnswer((int)Math.round(score), answer);
	}
	
	/**
	 * ���ݸ��������,��ʾ��Ŷ�Ӧ����Ŀ���������
	 * @param no ���
	 */
	public void displayItem(int no) {
		// �������,��service����,������Ŀ����
		Item item = service.getItem(no);
		// �õ������Ժ�,��ӡ���
		System.out.println(item);
		// ����ʾÿ����Ŀ��ͬʱ�����֮ǰ�����Ѿ�ѡ���˸���Ŀ�Ĵ𰸣����Ҳͬʱ��ʾ�Ա㿼���鿴��
		if (answer[no - 1] != 0) {
			System.out.println("��֮ǰ�Ĵ� :" + answer[no - 1]);
		}
	}
	
	/**
	 * ������ȡ�û��Ӽ����������Ϣ,���û�������ַ����еĵ�һ���ַ�����
	 * ���ҷ��ص��ַ�������ABCDNPF�е�һ��.
	 * @return ABCDNPF�е�һ��
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
				// �����Ѿ����õ��ַ���
				// ��ɴ�д����ͳһ����
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
					System.out.println("������������,������ABCDNPF�е�һ��!");
				}
				// ��������һ��,ֱ��ctrl+z����null�ķ���
				line = bufReader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
