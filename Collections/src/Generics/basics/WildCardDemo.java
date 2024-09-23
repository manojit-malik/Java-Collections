package Generics.basics;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
	
	
	//This method is not a Generic Method
	public static void displayData(List<?> list) {
		for(Object ob : list) {
			System.out.println(ob);
		}
		
//		list.add(10); We cannot write data, 
//		as Wild Card dosen't know what kind of data type will come
	}
	
//	Lower Bounded Wild Card implementation.
	private static void lowerBoundWildCard(List<? super Integer> list) {
		for(Object ob : list) {
			System.out.println(ob);
		}
		System.out.println();
		
		list.add(10);  // It is working because the List is of number type.
//		Number can accept Integer. So we can add Integer.
//		If it is of Integer type then also we can add Integer.
	}
	
	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(45);
		
//		Lower Bounded Wild Card implementation.
		List <Number> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		
		List <?> l = new ArrayList<>();
//		List <?> l1 = new ArrayList<?>();	Will throw an error.
//		l.add(2); As we don't know the type it will throw an error.
		
		List<? extends Number> l2 = new ArrayList<Number>();
		List<? extends Number> l3 = new ArrayList<Integer>();
		Number n = 12;
//		l2.add(n); It will still throw an error.
		
		
		List<? super Integer> l4 = new ArrayList<Integer>();
		List<? super Integer> l5 = new ArrayList<Number>();
		Integer i = 12;
		l4.add(i);
		l5.add(i);
		
		
		
		// Number is the parent type of Integer type, so it will work.
		lowerBoundWildCard(list1);	
		lowerBoundWildCard(list);
		
		
		
	}

}
