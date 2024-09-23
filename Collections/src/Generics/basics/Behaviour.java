package Generics.basics;



import java.util.ArrayList;



public class Behaviour {



	public static void main(String[] args) {



		ArrayList<String> l = new ArrayList<>();

		l.add("John");

		l.add("Doe");

		method(l);

		System.out.println(l);

		

		ArrayList l1 = new ArrayList<>();

		l1.add(false);

		l1.add(l);

		l1.add(89.39);

		System.out.println(l1);

		method1(l1);

		

	}

	

//	This method is a non-generic and 

//	here the generic list will behave as a non generic object 

	public static void method(ArrayList l) {

		l.add(10);

		l.add("Hi");

		l.add(true);

		System.out.println(l);

	}

	

	public static void method1(ArrayList<String> l) {

		l.add("Yo!!");

//		l.add(true);	It will throw an error, as for this method 

//		it will only accept String type of elements to add in the passed list.	

		l.add("YoHohohoho!!");

		System.out.println(l);

	}





}

