package Arrays.operations;



public class AnonymousArray {



	public static void main(String[] args) {

		

//		new int[] {1,2,3}	Anonymous Array we cannot declare like this.

		

//		It needs to be passed as an argument in a method

		arrMethod(new int[] {1,2,3});

		

	}

	

	public static void arrMethod (int[] arr) {

		

		for(int ele : arr)

		System.out.println(ele);

	}



}





