package Generics.basics;



public class DataNodeWild<E> {

	

	private E data;

	private DataNodeWild<? extends Number> next;

	

//	public DataNodeWild(E data, DataNodeWild<?> next) {

//		this.setData(data);

//		this.setNext(next);

//		

//	}

	

//	? it can be anything, but it should be sub-type of Number.

	public DataNodeWild(E data, DataNodeWild<? extends Number> next) {

		this.setData(data);

		this.setNext(next);

		

	}



	public E getData() {

		return data;

	}



	public void setData(E data) {

		this.data = data;

	}



	public DataNodeWild<? extends Number> getNext() {

		return next;

	}



	public void setNext(DataNodeWild<? extends Number> next) {

		this.next = next;

	}

	

	@Override

	public String toString() {

		return "DataNode [data = " + data + ", next : "+ next + "]";

	}



}



