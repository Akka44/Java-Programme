package com.generic;
class Demo<E>{
	void show(E a) {
		System.out.println(a);
	}
}
public class GenericDemo {
	public static void main(String[] args) {
        Demo<Integer> demo1=new Demo<Integer>();
        demo1.show(66);
        demo1.show(56);
        
        System.out.println();
        
        Demo<Double> demo2=new Demo<Double>();
        demo2.show(34.66);
        demo2.show(45.3);
        
        System.out.println();
        
        Demo<String> demo3=new Demo<String>();
        demo3.show("akshay");
        demo3.show("sharma");
        
        System.out.println();
        
        Demo demo4=new Demo();
        demo4.show(45);
        demo4.show("akshay");
        demo4.show('a');
        demo4.show("34.5");
	}
}
