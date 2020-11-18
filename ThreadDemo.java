package com.ex;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("x value is:"+i);
		}
	}
	
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is:"+i);
		}
	}

}
