package com.ex;

class NoThread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is:"+i);
		}
	}
}
public class ThreadNotAvailable {

	public static void main(String[] args) {
		NoThread nt=new NoThread();
		nt.run();
		for(int i=0;i<=10;i++) {
			System.out.println("x value is:"+i);
		}
	}

}	

