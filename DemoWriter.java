package com.files;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//It is an abstract class for writing to character streams.
public class DemoWriter {
	public static void main(String[] args) throws IOException {
		Writer w=new FileWriter("output.txt");
		String s="I love my country";
		w.write(s);
		w.close();
		System.out.println("done");
	}
}
