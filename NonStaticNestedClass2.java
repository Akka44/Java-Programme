package com.ex;

class University1{
	void announcement() {
		System.out.println("Exam starts from 1 dec");
		Department cse=new Department();
		cse.examPapers();
	}
	class Department{
		void examPapers() {
			System.out.println("Exam papers are being prepared");
		}
	}
}
public class NonStaticNestedClass2 {
	public static void main(String[] args) {
        University1 jntu=new University1();
        jntu.announcement();
	}
}
