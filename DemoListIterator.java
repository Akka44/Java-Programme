package com.cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoListIterator {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();  
		al.add("d");  
		al.add("dd");  
		al.add("ddd");  
		al.add("dddd");  
		al.add("ddddd");  
		System.out.println(al);  
		  
		ListIterator<String> iterator = al.listIterator();  
		while (iterator.hasNext())  
		{  
		  String i = iterator.next();  
		  System.out.println(i);  
		}  
	}
}
