package Generics.basics;

import java.util.Arrays;
import java.util.List;

public class BoundedT {

	public static void main(String[] args) {

		List <Integer> list = Arrays.asList(new Integer [] {2,5,4,8});
		
//		List <String> sList = Arrays.asList(new String[] {"John", "Doe"});
		List <Double> sList = Arrays.asList(new Double[] { 1.2, 4.5, 1.1});
		
		DataSorter<Integer> sorter1 = new DataSorter<>(list);
		
//		DataSorter<String> sorter2 = new DataSorter<>(sList);
		
		DataSorter<Double> sorter2 = new DataSorter<>(sList);
		
		sorter1.getSortedData();
		sorter2.getSortedData();
		
		CBound cbound = new CBound();
		
		getSortedData(cbound);
		
	}
	
//	Generic Method with Bound Type Parameter
	public static <T extends IBound1 & IBound2> void getSortedData(T list) {
//		list.sort(null);
//		for(T t : list) {
//			System.out.println(t);
//		}
	}

}

interface IBound1 {}
interface IBound2 {}

class CBound implements IBound1, IBound2 {}



