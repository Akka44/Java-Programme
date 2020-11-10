package com.files;
import java.io.FileOutputStream;

public class DemoFileOutputStream {
	public static void main(String[] args)  {
		try {
		 FileOutputStream fo=new FileOutputStream("d://test.txt");
		 fo.write(67); 
		 fo.close();
		 System.out.println("success...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
