package Lists;



import java.util.LinkedList;



public class LinkedLists {



	public static void main(String[] args) {



//		LinkedList without any argument in the constructor, or that is non-parameterized constructor.	

		LinkedList l = new LinkedList();

		

		

//		We passed a collection as an argument, and we get an equivalent LinkedList for that collection.	

//		LinkedList ll = new LinkedList(Collection c);

		

		l.add("John");

		l.add(1);

		l.add(null);

		l.add(true);

		System.out.println(l);

		

		

		l.set(0, "Hi");

		System.out.println(l);

		

		l.add(1, 23);

		System.out.println(l);

		

		l.removeLast();

		System.out.println(l);

		

		l.addFirst(false);

		System.out.println(l);

		

	}



}

