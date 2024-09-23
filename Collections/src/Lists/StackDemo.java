package Lists;



import java.util.Stack;



public class StackDemo {



	public static void main(String[] args) {



//		Only constructor to create Stack

		Stack s = new Stack();

		

		Stack<Integer> s1 = new Stack<>();

		

		s.push(10);

		s.push(30);

		s.push(true);

		

		System.out.println(s);

		

		Object o = s.pop();

		

		System.out.println(o);

		

		System.out.println(s);

		

		Object obj = s.peek();

		System.out.println(s.peek() + "----" + obj);

		

		

		System.out.println(s1);

		System.out.println("Is Stack s empty: " + s.empty());

		System.out.println("Is Stack s1 empty: " + s1.empty());



		s.add(30);	// Will add 30 to Stack s.

		s.push(30); // Will add 30 to Stack s.

		System.out.println(s);

		System.out.println(s.search(10));

		System.out.println(s.search(39));

		

		

	}



}

