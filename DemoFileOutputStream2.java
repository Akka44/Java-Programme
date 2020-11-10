package com.files;
import java.io.FileOutputStream;

public class DemoFileOutputStream2 {
	public static void main(String[] args) {
		try {
	    	FileOutputStream fo=new FileOutputStream("d://test.txt");
	    	String s="My assignments are there";
	    	fo.write(s.getBytes());
	    	fo.close();
	    	System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
