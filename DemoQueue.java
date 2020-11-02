package com.queue;
import java.util.PriorityQueue;

public class DemoQueue {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println(queue);
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());   
	}
}
