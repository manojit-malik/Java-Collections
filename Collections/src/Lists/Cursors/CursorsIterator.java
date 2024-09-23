package Lists.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorsIterator {

	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<>();
		
		data.add(12);
		data.add(23);
		data.add(36);
		
		Iterator it = data.iterator();
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			
			if(i%3==0) {
				System.out.println(i);
			}
			else {
				it.remove();
			}
		}
		
		System.out.println(data);
	}

}

