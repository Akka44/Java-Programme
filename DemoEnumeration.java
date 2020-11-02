package com.cursor;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class DemoEnumeration {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();  
        v.add(101);  
        v.add(34);  
        v.add(33);  
        v.add(32);  
        v.add(77);      
        Enumeration<Integer> e = Collections.enumeration(v);      
        System.out.print("Elements using Enumeration: ");  
        while(e.hasMoreElements()) {  
              Object obj = e.nextElement();  
              System.out.print(obj + " ");  
              }  
        }      
}
