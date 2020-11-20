package com.threads;

public class PriorityExample extends Thread {
	public synchronized void run() {
		System.out.println("Thread Name is: "+Thread.currentThread().getName());
		System.out.println("Thread Priority is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		PriorityExample p=new PriorityExample();
		p.setPriority(MIN_PRIORITY);
		PriorityExample p2=new PriorityExample();
		p2.setPriority(MAX_PRIORITY);
		p.start();
		p2.start();
	}
}