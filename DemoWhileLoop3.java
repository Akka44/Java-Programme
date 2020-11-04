package com.examples;
public class DemoWhileLoop3 {

	public static void main(String[] args) {
		int sum=0;
		int fact=1,rem,n=145;
		while(n!=0) {
			rem=n%10;
			while(rem!=0){
				fact=fact*rem;
				rem--;
			}
			System.out.println(fact);
			sum=sum+fact;
			n=n/10;
		}
		System.out.println("---------");
		System.out.println(sum);
	}
}
