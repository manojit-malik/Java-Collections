package Lists;



import java.util.Vector;



public class VectorDemo {





	public static void main(String[] args) {



//	 	It will create an empty vector of size 10.

		Vector v = new Vector(); 



//		This is a vector of size 20, when the size will be exceeded, 

//		the size will be of 40, as it increases by double. 

		Vector vec = new Vector(20);

		

//		This is a vector of size 30, and increment in size will be of 5 when the size exceed. 

		Vector v1 = new Vector(30, 5);

		

//		We can pass collection to the constructor as well

//		It can convert, ArrayList, Set, HashSet, HashMap, etc. to a Vector. (At the place of Collection c)

//		Vector v2 = new Vector(Collection c);

		

		Vector<Integer> vec1 = new Vector<>();

		

		v.add(1);

		v.add("Hello");

		v.add(true);

		v.addElement(7.18);

		System.out.println(v.get(1));

		System.out.println(v.firstElement());

		System.out.println(v.getLast());

		System.out.println(v.lastElement());

		System.out.println(v);

		

		v.remove(0);

		System.out.println(v);

		

		System.out.println("Size of the Vector is: " + v.size());

		System.out.println("Capacity of the Vector is: " + v.capacity());

		

	}



}

