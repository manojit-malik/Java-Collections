package Arrays.operations;



public class ElementsAssignmentsDemo {



	public static void main(String[] args) {

		

//		------------------------------------------------------

//		Primitive Type Array

//		------------------------------------------------------

		

		

		float[] y = new float [3];

		int [] x = new int[3];

		

		y[0] = 'a';

		System.out.println(y[0]);

		

		byte b = 2;

		y[1] = b;

		System.out.println(y[1]);

		

		System.out.println();System.out.println();

		

		

		

//		------------------------------------------------------

//		Object Type Array

//		------------------------------------------------------=

		

		Object [] objArray = new Object[5];

		

		objArray[0] = "Manojit";

		objArray[1] = 1;

		objArray[2] = 'a';

		objArray[3] = new String();

		objArray[3] = new Long[3];

		

		for(Object ele : objArray) {

			System.out.print(ele+"		");

		}

		

		System.out.println();System.out.println();

		

		

		

//		------------------------------------------------------

//		Abstract Class Type Array

//		------------------------------------------------------

		

		Number[] numArray = new Number[3];

		numArray[0] = new Byte("2");

		numArray[1] = new Integer(1);

		

		for(Number ele : numArray) {

			System.out.println(ele);

		}

		

		

		System.out.println();System.out.println();

		

		

//		------------------------------------------------------

//		Interface Type Array

//		------------------------------------------------------

		

		Runnable r[] = new Runnable[3];

		r[0] = new Thread();

		System.out.println(r[0]);

		System.out.println(r[1]);

		

		

	}



}



