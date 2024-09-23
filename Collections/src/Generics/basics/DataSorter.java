package Generics.basics;



import java.util.List;



//Bounded Type Parameter

public class DataSorter<T extends Number> {

	

	private List<T> list;

	

	public DataSorter(List <T> list) {

		this.list = list;

	}

	

	public void getSortedData() {

		list.sort(null);	// For natural sorting, null is used.

		for(T t : list) {

			System.out.println(t);

		}

	}



}



