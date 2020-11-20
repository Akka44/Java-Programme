package com.threads;
class Trainees{
	public synchronized void message(String companyName) {
		for(int i=0;i<5;i++) {
			System.out.print("Welcome to ");
			try {
				System.out.println(companyName);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread{
	Trainees t;
	String companyName;
	MyThread(Trainees t,String companyName) {
		this.companyName=companyName;
		this.t=t;
	}
	public void run() {
		t.message(companyName);
	}
}
public class SynchronizedExample {

	public static void main(String[] args) {
		Trainees Akshay=new Trainees();
		MyThread t1=new MyThread(Akshay, "Motivity");
		MyThread t2=new MyThread(Akshay, "JNIT");
		t1.start();
		t2.start();
	}

}
