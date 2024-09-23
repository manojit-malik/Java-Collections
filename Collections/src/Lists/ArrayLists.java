package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		List list = new ArrayList(l);  // We can pass the ArrayList l as an argument to the constructor.		
		ArrayList al = new ArrayList(15);  // We can pass the size limit as an argument to the constructor.		
//		Though size dosen't matter as it can contain elements more than 15.
		int siz = al.size();
		System.out.println(siz);
		for(int i=1;i<=5;i++) {
			al.add(i*2);
			al.add("Manojit");
			al.add(true);
		}
		al.add(10);
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		System.out.println(al);
		al.remove(10);  // It will remove the object from index 10.
		System.out.println(al);
		al.remove(new Integer(10));  //It will remove the first element with value 10 on any index, 
//		if there are multiple values with 10 in the ArrayList it will remove only the first value with 10, not the other values of 10.		
		System.out.println(al);  
//		int num = al.get(2);  Type mismatch: cannot convert from Object to int.
		System.out.println(al.get(2));
//		Generics Syntax:-
		ArrayList<String> list1 = new ArrayList<String>();
//		It will only take String as the value for this ArrayList list1.
//		It is safeguarded from runtime Exception.
	}

}
