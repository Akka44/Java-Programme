package com.set;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();		
		hs.add("f");
		hs.add("e");
		hs.add("d");
		hs.add("t");
		hs.add("");
		hs.add("u");
		hs.add("q");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("f"));
		hs.remove("e");
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
	}
}
