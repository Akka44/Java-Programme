package com.list;
import java.util.ArrayList;
public class FindDuplicate {

	public static void main(String[] args) {
	     ArrayList<Integer> al=new ArrayList<>();
	     al.add(34);
	     al.add(11);
	     al.add(87);
	     al.add(76);
	     al.add(21);
	     al.add(82);
	     al.add(56);
	     al.add(31);
	     al.add(98);
	     al.add(44);
	     al.add(12);
	     al.add(76);
	     al.add(89);
	     System.out.println(al);
	     
	     for(int i=0;i<al.size()-1;i++) {
	    	 for(int j=i+1;j<al.size();j++) {
	    		 if(al.get(i)==al.get(j)) {
	    			 System.out.println("Duplicate element is "+al.get(i));
	    		 }
	    	 }
	     }

	}

}
