package com.files;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//SequenceInputStream class reads data from multiples streams, It reads data sequentially
//SequenceInputStream class extends InputStream
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream f1=new FileInputStream("d://test.txt");
		FileInputStream f2=new FileInputStream("d://test1.txt");
		
		//reading data from two files
		SequenceInputStream sq=new SequenceInputStream(f1,f2);
		int i=sq.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=sq.read();
		}
	}
}
