package com.files;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemobufferedOutputStream {
	public static void main(String[] args) throws IOException {
		try {
	    	FileOutputStream fo=new FileOutputStream("d://test1.txt");
		    BufferedOutputStream bs=new BufferedOutputStream(fo);
		    String s="welcome to file handling";
		    bs.write(s.getBytes());
		    bs.close();
		    fo.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
