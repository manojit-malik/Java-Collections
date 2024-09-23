package Arrays.twoDArray;



public class ArraysDemo {



	public static void main(String[] args) {

		

//		-----------------------------------------------------

//		1-D Array

//		-----------------------------------------------------



		int x[];

		

		x = new int [3];

		

		int y[] = {1, 2, 3, 4};

		

		int z[] = new int[3];

		

		System.out.println(z[0]);

		System.out.println(z[1]);

		System.out.println(z[2]);

		System.out.println();

		

		z[0]= 10;

		z[1]= 20;

		z[2]= 30;

		

		for(int ele : z) {

			System.out.println(ele);

		}

		

		System.out.println(z);

		

		System.out.println();System.out.println();System.out.println();

		

		

//		-----------------------------------------------------

//		2-D Array

//		-----------------------------------------------------

		

		int [][] a;

		

		int b[][] = new int[3][];

		

		System.out.println(b[0]);	

		//OP- null, as the size is not mentioned while declaring. 

		

		

//		System.out.println(b[0][0]);

		//OP- NullPointerException, as in b[0][0] no element is present

		

		b[0] = new int[2];

		b[1] = new int[3];

		

		System.out.println(b[0][0]);

//		OP- 0, As of now the array is declared but no value is provided.

		

		b[0][0] = 55;

		System.out.println(b[0][0]);

//		OP- 55

		

		int c[][] = {{1, 2, 3}, {4, 5}};

		

		for(int array[] : c) {

			for(int ele: array) {

				System.out.print(ele+" ");

			}

			System.out.println();

		}

		

		System.out.println();System.out.println();System.out.println();

		

//		-----------------------------------------------------

//		3-D Array

//		-----------------------------------------------------	

		

		// Declare a 3D array with dimensions 2x3x4

        int[][][] threeDArray = new int[3][4][2];



        // Initialize the array with values

        int value = 1;

        for (int i = 0; i < threeDArray.length; i++) {

            for (int j = 0; j < threeDArray[i].length; j++) {

                for (int k = 0; k < threeDArray[i][j].length; k++) {

                    threeDArray[i][j][k] = value;

                    value++;

                }

            }

        }



        // Print the values of the 3D array

//        for (int i = 0; i < threeDArray.length; i++) {

//            for (int j = 0; j < threeDArray[i].length; j++) {

//                for (int k = 0; k < threeDArray[i][j].length; k++) {

//                    System.out.println("threeDArray[" + i + "][" + j + "][" + k + "] = " + threeDArray[i][j][k]);

//                }

//            }

//        }

        

        for(int[][] arr2: threeDArray) {

        	for(int[] arr: arr2) {

        		for(int ele: arr) {

        			System.out.print(ele + " ");

        		}

        		System.out.println();

        	}

        	System.out.println();

        }

		

		

		

		

	}



}



