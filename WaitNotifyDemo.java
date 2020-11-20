package com.threads;

class Customer{
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if(this.amount<amount) {
			System.out.println("less amount go and deposit");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdraw success");
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("Deposit done");
		notify();
	}
}
public class WaitNotifyDemo {

	public static void main(String[] args) {
		Customer vijay=new Customer();
		new Thread() {
			public void run() {
				vijay.withdraw(20000);
			}
		}.start();
		new Thread() {
			public void run() {
				vijay.deposit(25000);
			}
		}.start();

	}

}
