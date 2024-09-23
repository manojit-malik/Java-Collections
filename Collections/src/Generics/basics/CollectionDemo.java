package Generics.basics;



import java.util.ArrayList;



public class CollectionDemo {



	public static void main(String[] args) {



		ArrayList<String> list = new ArrayList<>();  // Generic ArrayList of type String.

		

		list.add("John");

//		list.add(1);

		

		for(String obj : list) {

			String str = obj;

			System.out.println(str);

		}

		

		

	}



}

