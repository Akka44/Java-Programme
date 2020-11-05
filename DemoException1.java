package com.exception;

public class DemoException1 {
	public static void main(String[] args) {
       int[] arr= {1,2,3,4};
       try {
    	    System.out.println(arr[5]);
       }
       catch(ArrayIndexOutOfBoundsException e) {
    	   e.printStackTrace();
    	   System.out.println("Exception thrown: "+e);
       }
	}
}
