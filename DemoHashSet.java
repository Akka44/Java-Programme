package com.set;
import java.util.HashSet;
public class DemoHashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();		
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
