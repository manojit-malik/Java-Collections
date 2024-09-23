package Generics.basics;



import java.util.List;



public class GenericMethod {

	

	private List a;

	

//	This is a Generic Constructor

	public <T> GenericMethod(List<T> a) {

		this.a = a;

	}

	

	

//	This is a Generic Method

	public static <T> String concat (T data) {

		

		return "Data is : " + data;

	}



	public static void main(String[] args) {



		String data = "sdg";

		int num = 123;

		

		System.out.println(concat(data));

		System.out.println(concat(num));

		System.out.println(concat(10.6));

		

		

	}



}

