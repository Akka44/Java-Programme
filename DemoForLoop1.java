package com.examples;
public class DemoForLoop1 {

	public static void main(String[] args) {
		int fact=1;
		int n=8;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
