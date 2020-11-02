package com.wrapper;
public class WrapperDemo {

	public static void main(String[] args) {
	    	Integer i=new Integer("56");
	    	System.out.println(i);
	    	
	    	int a=34;
	    	Integer s=new Integer(a);
	    	System.out.println(s);
	    	
	    	int b=s;
	    	System.out.println(b);
	    	
	    	int c=i;
	    	System.out.println(c);
	    	
	    	
	}
}
