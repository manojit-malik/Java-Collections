package Lists.Cursors;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsEnum {

	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println("Enter the Elements: ");
		
		for(int i = 1;i<=8;i++) {
			Scanner sc = new Scanner(System.in);
			Integer data = sc.nextInt();
			v.addElement(data);
		}
		
		System.out.println("Vector: " +v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			Integer element = (Integer)e.nextElement();
			
			if(element%3 == 0) {
				System.out.println(element + " is divisible by: " + 3);
			}
		}
	}

}

