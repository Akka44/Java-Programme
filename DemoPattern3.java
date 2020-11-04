package com.examples;
import java.util.Scanner;

public class DemoPattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=-1,b=1,sum=0;;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			  	sum=a+b;
			  	System.out.print(sum+" ");
			  	a=b;
			  	b=sum;
			}
			System.out.println();
		}
	}
}
