package dsa;

public class Node {
private Node next; //Pointer reference. Node inside itself. Nodeception.
private String data;
private Node head;
public Node() {
}
public Node(Node next, String data) {
	super();
	this.next = next;
	this.data = data;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
@Override
public String toString() {
	if (next != null) {
		return data + " -> ";
	}
	return data;
}

private Node getNodeAt(int index) {
	Node node = head;
	for (int i = 0; i < index; i++) {
		if (node == null) {
			return null;
		}
		node = node.getNext();
	}
	return node;
}

}
