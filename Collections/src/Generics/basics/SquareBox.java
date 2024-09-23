package Generics.basics;



import java.util.List;





//public class SquareBox<E> extends Box<T>{  <T> and <E> are not each other's sub-type

// So it will cause an error.

//T cannot be resolved to a type





public class SquareBox<T> extends Box<T>{



	public SquareBox(List<T> a) {

		super(a);

	}



}

