package com.atguigu.collect;

/*
 * 单向链表
 */
public class MySingleLinkedList {
	//第二步：声明一个单向链表的头
	private Node head;//这里不用提前new，当你添加的第一个元素，就是作为头结点
	private int total;
	
	//第三步：编写方法
	/*
	 * 添加一个元素到当前单向链表中
	 * obj是数据
	 */
	public void add(Object obj){
		//(1)先判断单向链表是否是空的，依据就是这个头是否是空的
		if(head == null){
			//①是空链表
//			head = 第一个结点
			head = new Node(obj,null);//obj作为新结点的数据，null表示新结点后面没有结点了
		}else{
			//②不是空的
			//先找到最后一个结点，依据就是xx.next == null
			//从哪里开始找，只能从head开始
			Node node = head;
			while(node.next!=null){
				node = node.next;
			}
			//退出循环时，说明node就是最后一个结点
			node.next = new Node(obj,null);//把新结点链接到最后一个结点的next中
		}
		total++;
	}
	
	//删除obj这个元素，obj是数据，如果有重复的只删第一个
	public void remove(Object obj){
		//还要考虑obj是否是null
		if(obj==null){
			//考虑特殊情况，要删除的是第一个结点
			if(head.data == null){
				Node removeNode = head;//被删除的结点
				head = head.next;
				removeNode.next = null;//与后面的结点断开
			}else{
				//找到被删除结点和它的上一个结点
				Node left = head;
				Node removeNode = left.next;
				while(removeNode.data != null){
					if(removeNode.next==null){
						return;//找到最后一个结点，都不是我们要删除的结点，直接结束
					}
					left = removeNode;//当前结点变成下一次的上一个结点
					removeNode = removeNode.next;
				}
				//出了循环，removeNode是要删除的结点,left是它的上一个
				left.next = removeNode.next;
				
				//使得removeNode称为垃圾
				removeNode.next = null;
				removeNode.data = null;
			}
		}else{
			//考虑特殊情况，要删除的是第一个结点
			if(obj.equals(head.data)){
				Node removeNode = head;//被删除的结点
				head = head.next;
				removeNode.next = null;//与后面的结点断开
			}else{
				//找到被删除结点和它的上一个结点
				Node left = head;
				Node removeNode = left.next;
				while(!obj.equals(removeNode.data)){
					if(removeNode.next==null){
						return;//找到最后一个结点，都不是我们要删除的结点，直接结束
					}
					left = removeNode;//当前结点变成下一次的上一个结点
					removeNode = removeNode.next;
				}
				//出了循环，removeNode是要删除的结点,left是它的上一个
				left.next = removeNode.next;
				
				//使得removeNode称为垃圾
				removeNode.next = null;
				removeNode.data = null;
			}
		}
		total--;
	}
	
	/*
	 * 返回当前单向链表的所有元素的数据
	 */
	public Object[] toArray(){
		//第一步：创建一个数组
		Object[] all = new Object[total];
		
		//第二步：把单向链表中的所有结点的data一一放到这个数组中
		if(total!=0){
			Node node = head;
			for (int i = 0; i < all.length; i++) {
				all[i] = node.data;
				node = node.next;
			}
		}
		
		return all;
	}
	
	//第一步：设计一种新类型，结点类型，这个类型只在这里使用
	//这里Node加private，是希望这个Node只在MySingleLinkedList外部类中使用
	private class Node{
		//这里不私有化的目的，是希望在外部类中使用时，不需要用get/set方法
		Object data;
		Node next;
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}
