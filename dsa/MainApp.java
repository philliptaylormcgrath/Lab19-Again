package dsa;

public class MainApp {

	public static void main(String[] args) {
		myArrayList list = new myArrayList();
		list.addAtBeginning("hello");
		list.addAtBeginning("hello2");
		list.addAtBeginning("hello3");
		list.addAtBeginning("hello4");
		//System.out.println(list);
		System.out.println("Linked list starts here");
		
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtBeginning("HALP");
		linkedList.addAtBeginning("HALP1");
		linkedList.addAtBeginning("HALP2");
		
		System.out.println(linkedList);
		
		linkedList.removeFromBeginning();
		System.out.println(linkedList);
		linkedList.addAtEnd("THIS IS THE END NOW FOR A MOMENT");
		System.out.println(linkedList);
		linkedList.removeAtIndex(1);
		System.out.println(linkedList);
		

	}

}
