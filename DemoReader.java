package com.files;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//java Reader is an abstract class for reading character streams
public class DemoReader {
	public static void main(String[] args) throws IOException{
		Reader rd=new FileReader("output.txt");
		int i=rd.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=rd.read();
		}
	}
}
