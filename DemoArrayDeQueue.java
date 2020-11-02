package com.queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class DemoArrayDeQueue {

	public static void main(String[] args) {
		 Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay");
		   System.out.println(deque);
	}
}
