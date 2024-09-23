package Arrays.operations;



public class TraverseThroughArray {

	

	public static void main(String[] args) {

		

		int arr[] = new int[5];

		

		int index=0;

		for(int val : arr) {

			arr[index] = index + 3;

			index++;

		}

		

		for(int val : arr) {

			System.out.println(val);

		}

		

		System.out.println();System.out.println();

		

//		-------------------------------------------

		

		int [][] b = new int [2][3];

		

		for( int[] val : b) {

			for(int ele : val) {

				System.out.print(ele + " ");

			}

			System.out.println();

		}

		

		System.out.println();

		

		for(int i=0;i<b.length;i++) {

			for(int j=0;j<b[i].length;j++) {

				System.out.print(b[i][j] + " ");

			}

			System.out.println();

		}

		

		

//		-------------------------------------------

		

	}



}





