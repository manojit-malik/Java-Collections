package Generics.basics;



import java.util.List;



public class RawTypeDemo {



	public static void main(String[] args) {



		Box<Integer> genBox = new Box<>(List.of(1,2,3,4));

		

		for(Integer num : genBox.getA()) {

			System.out.print(num+" ");

		}

		

		System.out.println();

		

		Box rawBox = new Box(List.of(1,2,"John"));

		

		for(Object obj : rawBox.getA()) {

			System.out.print(obj+" ");

		}

		

		System.out.println();System.out.println();

		

		

//		Multiple Type Parameters - HashMap

		

		Bin<String, Integer> bin = new Bin<>();

		bin.setDrytrash("iwuveyfqeub");

		bin.setWetTrash(1233423);

		

		System.out.println(bin.getDrytrash());

		System.out.println(bin.getWetTrash());

		

		

		

	}



}

