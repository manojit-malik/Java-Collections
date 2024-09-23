package Generics.basics;



import java.util.ArrayList;



public class DataStructureDemo {



	public static void main(String[] args) {



		String[] strArray = new String[20];

		Employee[] empArr = new Employee[20];

		strArray[0] = "Manojit";

//		strArray[1] = new Employee(); Type mismatch: cannot convert from Employee to String

		

		ArrayList<Integer> list = new ArrayList();

		ArrayList<Integer> list1 = new ArrayList();

		

		ArrayList l = new ArrayList();

//		int -> Integer

		l.add("Manojit");

		l.add(1);

		l.add(new Employee());

		

//		String s = l.get(0);	It will cause an error as ArrayList l is of type Object

		String s = (String) l.get(0);

		

//		Employee name = (Employee) l.get(0);  It will throw an exception java.lang.ClassCastException	

		

	}



}

