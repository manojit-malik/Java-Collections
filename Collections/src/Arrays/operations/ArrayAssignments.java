package Arrays.operations;



public class ArrayAssignments {



	public static void main(String[] args) {



		int[] x = new int[2];

		int[] a = x;

		x[0] = 1;

		System.out.println(x[0]+" " +a[0]);

		a[1] = 2;

		System.out.println(x[1]+" " +a[1]);

		

		System.out.println();System.out.println();

		

		

		

		

//		------------------------------------------------------

		

		int[] b = {1,2,3};

		int[] c = {11,22};

		b=c;

		b[0]=99;

		c[1]=88;

		for(int ele: b) {

			System.out.print(ele +" ");

		}

		System.out.println();

		for(int ele: c) {

			System.out.print(ele+ " ");

		}

		

		System.out.println();System.out.println();

		

		

		

		

//		------------------------------------------------------

		

//		We can do this

		String[] s = new String[3];

		Object[] obj = s;

		

		

//		We cannot do this

//		short[] srt = new short[2];	//	[S

//		int[] n = srt;				//	[I

//		As there is no relation in between these two classes ([S and [I), 

//		so we cannot do this

		

	}



}



