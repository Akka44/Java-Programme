package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DemoEntrySet {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "mahesh");
		hm.put(2, "susheel");
		hm.put(3, "sai");
		hm.put(4, "srikanth");
		hm.put(5, "chakri");
		hm.put(6, "lavanya");
		hm.put(7, "naresh");
		System.out.println("Initial mapping are "+hm);
		Set<Map.Entry<Integer, String>> s=hm.entrySet();
		for(Map.Entry<Integer,String> x:s) {
			System.out.println(x.getKey()+" "+x.getValue());
		}		
		
	}

}
