package dsa;
//Deleted class and replaced with interface

public interface MyList {

	void addAtBeginning(String data);

	void removeFromBeginning();

	void addAtEnd(String data);

	void removeFromEnd();

	String get(int index);

	int size(); // Indicates how many items are in the list

}
