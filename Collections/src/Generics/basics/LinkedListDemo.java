package Generics.basics;



public class LinkedListDemo {

	

	public static void main(String[] args) {

		

		DataNode<Integer> node3 = new DataNode<>(30, null);

		DataNode<Integer> node2 = new DataNode<>(20, node3);

		DataNode<Integer> node1 = new DataNode<>(10, node2);

		

		DataNode<Double> node04 = new DataNode<>(30.0, null);

		DataNode<Double> node03 = new DataNode<>(30.0, node04);

		DataNode<Double> node02 = new DataNode<>(20.0, node03);

		DataNode<Double> node01 = new DataNode<>(10.0, node02);

		

		DataNode<Number> node0B = new DataNode<>(Double.valueOf(10.0), null);

		DataNode<Number> node0A = new DataNode<>(Double.valueOf(10.0),node0B);

		

//		It will throw an error as, type types are different, Integer and Double

//		DataNode<Integer> nodeA = new DataNode<>(10, node02);

		

//		It will throw an error as, type types are different, Number and Integer.

//		DataNode<Number> node0A = new DataNode<>(Double.valueOf(10.0),node2); OR

//		node0A.setNext(node2);	Above line and this line means the same.

		

//		The type should be same.

		

//		Number is parent of Integer or Double, 

//		but DataNode<Number> is not parent of DataNode<Integer> or DataNode<Double>

		

//		The above issues can be resolved by Wild Cards i.e. ?

		

//		This is the compiler's signature.

//		DataNode(Integer, DataNode(Integer))

		

		System.out.println(node1.toString());

		

		System.out.println();

		

		System.out.println(node02.toString());

		

		System.out.println();

		

		System.out.println(node01.toString());

		

		

		System.out.println();System.out.println();System.out.println();

		

//		--------------------------------------------------------------------------------

		

//		This is using Wild Cards (Issue Resolved).

		

		DataNodeWild<Integer> nodee3 = new DataNodeWild<>(30, null);

		DataNodeWild<Integer> nodee2 = new DataNodeWild<>(20, nodee3);

		DataNodeWild<Integer> nodee1 = new DataNodeWild<>(10, nodee2);

		

		DataNodeWild<Double> nodee04 = new DataNodeWild<>(30.0, null);

		DataNodeWild<Double> nodee03 = new DataNodeWild<>(30.0, nodee04);

		DataNodeWild<Double> nodee02 = new DataNodeWild<>(20.0, nodee03);

		DataNodeWild<Double> nodee01 = new DataNodeWild<>(10.0, nodee02);

		

		

//		This will throw an error, as String is not a sub-type of Number.

//		DataNodeWild<Number> nodee0D = new DataNodeWild<>("This is String", null);

//		DataNodeWild<Number> nodee0C = new DataNodeWild<>(30.0, nodee0D);

		

		DataNodeWild<Number> nodee0B = new DataNodeWild<>(Double.valueOf(20.0), null);

		DataNodeWild<Number> nodee0A = new DataNodeWild<>(Double.valueOf(10.0),nodee0B);

		

//		It will throw an error as, tye types are different, Integer and Double

		DataNodeWild<Integer> nodeeA = new DataNodeWild<>(10, nodee02);

		

//		It will not throw an error.

//		DataNodeWild<Number> nodee0A = new DataNodeWild<>(Double.valueOf(10.0),nodee2); // OR

		nodee0A.setNext(nodee2);	//Above line and this line means the same.

		

		

		System.out.println(nodee1.toString());

		

		System.out.println();

		

		System.out.println(nodee02.toString());

		

		System.out.println();

		

		System.out.println(nodeeA.toString());

		

		

	}



}

