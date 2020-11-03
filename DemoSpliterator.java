package com.cursor;
import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class DemoSpliterator {
	public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<Integer>();   
         list.add(101);  
         list.add(201);  
         list.add(301);  
         list.add(401);  
         list.add(501);                        
         Stream<Integer> str = list.stream();                 
         Spliterator<Integer> splitr = str.spliterator();                                              
         System.out.println("Estimate size: " + splitr.estimateSize());                   
         System.out.println("Exact size: " + splitr.getExactSizeIfKnown());            
         System.out.println("Boolean Result: "+splitr.hasCharacteristics(splitr.characteristics()));            
         System.out.println("Elements of ArrayList :");  
         splitr.forEachRemaining((n) -> System.out.println(n));            
         Stream<Integer> str1 = list.stream();  
         splitr = str1.spliterator();           
         Spliterator<Integer> splitr2 = splitr.trySplit();            
         if(splitr2 != null) {  
         System.out.println("Output from splitr2: ");  
             splitr2.forEachRemaining((n) -> System.out.println(n));  
         }     
         System.out.println("Output from splitr1: ");  
             splitr.forEachRemaining((n) -> System.out.println(n));  
         }   
}
