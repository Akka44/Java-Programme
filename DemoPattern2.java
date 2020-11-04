package com.examples;
import java.util.Scanner;

public class DemoPattern2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			  	if(k==0) {
				  System.out.print(k);
				  k=1;
			  	} 
				else {
				  System.out.print(k);
				  k=0;
				}
			}
			System.out.println();
		}
	}
}
