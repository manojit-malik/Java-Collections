package Generics.basics;



public class Demo {



	public static void main(String[] args) {

		

//		Two types of Generics -> 1. Generic Class & 2. Generic Interfaces



		Data<String> d1 = new Data<String>("This is d1");

		

		System.out.println(d1.toString());

		

		Data<Integer> d2 = new Data<>(10);

		

		System.out.println(d2.toString());

		

		IData<String> d3 = new Data<>("We have implemented Generics Interface");

		

		System.out.println(d3.toString());

		

		

//		Sub-Classing

		

		Data<String> d4 = new Data<>("This is data : d4");

//		BaseData<Integer> b1 = d4;	This will throw an error i.e. Type mismatched

		BaseData<String> b1 = d4;

		

		

		

	}



}

