package com.examples;
import java.util.Scanner;

public class DemoPattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}
