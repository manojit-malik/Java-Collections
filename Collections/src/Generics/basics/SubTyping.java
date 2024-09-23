package Generics.basics;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {

	public static void main(String[] args) {

		Object o = new Object();
		Integer i = Integer.valueOf(11);
		o=i;	//  We can assign i to o as Integer is sub-type of Object, 
				//	So they are compatible.	 
		System.out.println(o);
		
		List<Number> list = new ArrayList<>();
		list.add(Integer.valueOf(12));
		list.add(Double.valueOf(10.9));
//		list.add(Character.valueOf('a')); We cannot add it as Character is not sub-type of Number.	
		
		System.out.println(list);
		
		System.out.println();
		
		List<Box<Integer>> bList = new ArrayList<>();
		bList.add(new Box<>(List.of(1,2,3,4)));
		bList.add(new SquareBox<>(List.of(5,6,7,8)));
		
//		List<Number> al = new ArrayList<Integer>();
//		It will throw an error as ArrayList<Integer> is not a sub-type of List<Number>

//		ArrayList<Number> al = new ArrayList<Integer>();  // It will still throw an error
//		It is necessary that both the type argument are same
		
		List<Integer> al = new ArrayList<Integer>();
//		ArrayList<Integer> is a sub-type of List<Number>
		
		
	}

}

