package Generics.basics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErasureDemo {
	
	public static void main(String[] args) {
		Integer n = 2;
		
//		We will get Cast Class exception, Integer cannot be cast to String.
//		method1(n);
		
//		It works.
		ArrayList l1 = new ArrayList<String>();
//		It behaved as below
//		ArrayList l1 = new ArrayList();
		l1.add(12);
		l1.add(true);
		l1.add("John");
		System.out.println(l1);
//		Type erasure feature removed the generic syntax, hence the generic syntax was not available to JVM.		
	
	}
	
	public static String method1(Integer x) {
		List <String> a = new LinkedList<String>();
		
//		List a = new LinkedList;
		List b = a;	// It became equivalent to List a.
		b.add(x);
		
//		Compiler removed the generic information from this line.
		return a.iterator().next();
//		return (String) a.iterator().next();  //  Compiler did this for us
//		i.e. Compiler inserted the necessary cast for us.
		
	}
	
	
//	OverLoading
//	Signature are different i.e. int X and String d.
	public static void method2 (int x) { }
	public static void method2 (String d) { }
	
//	Overloading.
//	Error: Erasure of method method3(ArrayList<Integer>) is the same as another method in type ErasureDemo
//	public static void method3 (ArrayList<String> l1) { }
//	public static void method3 (ArrayList<Integer> l1) { }
//	So we cannot Overload methods like this.
	
//	Compiler worked like, Type erasure feature removed the generic syntax and both signature became same.
//	Which resulted to this Compile Time Error

}

