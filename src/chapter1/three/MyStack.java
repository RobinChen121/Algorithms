package chapter1.three;

import java.util.Iterator;

/** 
* @author chen zhen 
* @version 创建时间：2018年1月15日 下午9:57:28 
* @value 类说明:
*/
public class MyStack<Item> implements Iterable<Item>{
	private Node<Item> first; // top of stack
	private int N;            // stack size
	
	
	/**
	 * self define a Node class
	 */
	public static class Node<Item>{
		Item item;
		Node<Item> next;
	}
	
	/**
	 * an empty stack
	 */		
	public MyStack() {
		first = null;
		N = 0;
	}
	
	public void push(Item item) {
//		if (first == null) // 两种方法
//			first = new Node<Item>();
//		else 
//			first.next =first;
//		first.item = item;
		
		Node<Item> oldNode = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldNode;
		
		N++;
	}
	
	public Item pop() {
		Item temp = first.item;
		first.next = first;
		N--;
		return temp;
	}
	
	public Iterator<Item> iterator(){
		return new ItemIterator();
	}
	
	private class ItemIterator implements Iterator<Item>{
		// 定义一个 iterator 三个必要的方法 hasNext, remove, Next
		private Node<Item> current = first;
		public boolean hasNext() {return current != null;}
		public void remove() {}
		public Item next() {
			Item item = (Item) current.item;
			current = current.next;
			return item;
		}
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (Item i : this) {
			str.append(i);
			str.append(" ");
		}
		return str.toString();
	}
	
	public void deleteLastNode() {
		Node<Item> newNode = new Node<>();
		if (first == null) 
			return;
		else
			newNode = first; 
		while (newNode.next.next != null) {
			newNode = newNode.next;
		}
		newNode.next = null;
		
//		while (first.next.next != null)
//			first = first.next;
//		first.next = null;
	}
	
	public void delete(int k) {
		Node<Item> temp;
		if (first == null) {
			System.out.println("no value");
			return;
		}
		else
			temp = first;
		
		if (k == 1) 
		{
			first = first.next;
			return;
		}
		
		
		// 递归也能做
		for (int i = 1; i < k; i++) {
			if (temp == null || temp.next == null) 
			{
				System.out.println("no value");
				return;
			} 
			if (i + 1 == k)
				temp.next = temp.next.next;	
			else
				temp = temp.next;
		}			
	}
	
	public static void main(String[] args) {
		MyStack<String> str = new MyStack<>();
		str.push("chen");
		str.push("zhen");
		str.push("guang");

		str.delete(1);
		System.out.println(str.toString());
		
	}

}
