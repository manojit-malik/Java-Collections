package Generics.basics;



public class DataNode<E> {

	

	private E data;

	private DataNode<E> next;

	

	public DataNode(E data, DataNode<E> next) {

		this.setData(data);

		this.setNext(next);

		

	}



	public E getData() {

		return data;

	}



	public void setData(E data) {

		this.data = data;

	}



	public DataNode<E> getNext() {

		return next;

	}



	public void setNext(DataNode<E> next) {

		this.next = next;

	}

	

	@Override

	public String toString() {

		return "DataNode [data = " + data + ", next : "+ next + "]";

	}



}



