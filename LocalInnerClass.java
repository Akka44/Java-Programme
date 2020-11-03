package com.ex;
class University2{
	void announcement() {
		System.out.println("Exam starts from 1 dec");
		int papers=50;
		class Department {
			void examPapers() {
				System.out.println("Exam papers are being prepared "+papers);
			}
		}
		Department cse=new Department();
		cse.examPapers();
	}
}
public class LocalInnerClass {
	public static void main(String[] args) {
		University2 jntu=new University2();
		jntu.announcement();
	}
}
