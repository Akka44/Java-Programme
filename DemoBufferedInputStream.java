package com.files;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoBufferedInputStream {
	public static void main(String[] args) throws IOException{
		FileInputStream fin=new FileInputStream("d://test1.txt");
		BufferedInputStream bs=new BufferedInputStream(fin);
		int i=0;
		while((i=bs.read())!=-1) {
			System.out.print((char)i);
		}
		bs.close();
		fin.close();
	}
}
