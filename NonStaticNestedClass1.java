package com.ex;
class University{
	void announcement() {
		System.out.println("Exam starts frpom 1 Dec");
	}
	class Department{
		void  examPapers() {
		   System.out.println("exam papers are being prepared");	
		}
	}
}
public class NonStaticNestedClass1 {
	public static void main(String[] args) {	
       University jntu=new University();
       jntu.announcement();
       University.Department cse=jntu.new Department();
       cse.examPapers();
	}
}
