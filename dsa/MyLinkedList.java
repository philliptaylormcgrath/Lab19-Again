package dsa;

public class MyLinkedList implements MyList {
	private Node head;
	
	private int myLength = 0;
	private Node tail;
	
	

	@Override
	public void addAtBeginning(String data) {
		// add a new Node and set it to the head
		head = new Node(head, data);
		myLength++;
		
	}

	@Override
	public void removeFromBeginning() {
		head = head.getNext();
		myLength--;
		
	}
	public Boolean insertAtIndex(int index, String data) {
		Node node = head;
		Node newNode = (new Node(node,data));
		if(index>myLength)
			return false;
		if(index == 0)
		{
			addAtBeginning(data);
		}
		else {
			for(int i = 0; i<index-1; i++)
				node = node.getNext();
			newNode.setNext(newNode);
			node.setNext(newNode);
			myLength++;
		}
			
		
		return true;
	}
	
	public boolean removeAtIndex(int index) {
		Node node = head;
		if (index > myLength)
		return false;
		
		if (index == 0) {
			head = node.getNext();
			myLength--;
		}
		else {
		for(int i = 1; i<index; i++)
			
		node = node.getNext();
		node.setNext(node.getNext().getNext());
		myLength--;
		}
		return true;
		
	}

	@Override
	public void addAtEnd(String data) { //Finish with lab 19, also download mysql, also review murder mystery
		Node node = new Node(null, data);
		tail = getNodeAt(myLength-1);
		tail.setNext(node);
		myLength++;
		
	}

	@Override
	public void removeFromEnd() {
		if (myLength < 2)
			head.setNext(null);
		
		Node newTail = getNodeAt(myLength-2);
		newTail.setNext(null);
		
		myLength--;
		
	}

	@Override
	public String get(int index) {
		//Finish with lab 19. Gets String at this index
		return null;
	}

	@Override
	public int size() {
		
		return myLength;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node node = head;
		//follow the links between the nodes until it reaches the end
		while(node !=null) {
			sb.append(node);
			node = node.getNext();
			
		}
		sb.append(" ]");
		
		return sb.toString();
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
