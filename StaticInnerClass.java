package com.ex;
class University3{
	static class Department{
		void announcement() {
			System.out.println("cse result declared");
		}
		static void result() {
			System.out.println("Result kept in website");
		}
	}
}
public class StaticInnerClass {
	public static void main(String[] args) {
		University3.Department cse=new University3.Department();
		cse.announcement();
		University3.Department.result();
	}
}
