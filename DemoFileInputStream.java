package com.files;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoFileInputStream {
	public static void main(String[] args) throws IOException {
		   try{    
	            FileInputStream fin=new FileInputStream("D:\\test.txt");    
	            int i=0;    
	            while((fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
	          }catch(Exception e){
	        	  System.out.println(e);
	        }    	         
	}
}
