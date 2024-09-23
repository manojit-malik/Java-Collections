package Generics.basics;



interface IInterface<T> {}



interface IInterface2 {}



class Class2<T> implements IInterface<T>{ }



//public class Class1 implements IInterface<T>{		//	It will throw an error i.e. T cannot be resolved to a type

public class Class1<T> extends Class2<T> implements IInterface<T>{

	

	public static void main(String[] args) {

		

	}

	

}









