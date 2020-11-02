package com.set;
import java.util.TreeSet;
public class DemoTreeSet {

	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<String>();		
		hs.add("f");
		hs.add("e");
		hs.add("d");
		hs.add("t");
		hs.add("u");
		hs.add("q");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("f"));
		System.out.println(hs.headSet("q",true));
		System.out.println(hs.tailSet("f",false));
		System.out.println(hs.subSet("e","t"));
		System.out.println(hs.first());
		System.out.println(hs.last());
		System.out.println(hs.lower("q"));
		System.out.println(hs.floor("f"));
		System.out.println(hs.ceiling("f"));
		System.out.println(hs.higher("f"));
		hs.remove("e");
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		
		
	}
}
