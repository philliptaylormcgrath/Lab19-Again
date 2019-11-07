package dsa;

import java.util.Arrays;

public class myArrayList implements MyList {

	private String[] arr = new String[4];
	private int myLength = 0;
	
	// we will use this method as a helper method inside this class. 
	
	private boolean isFull() {
		return arr.length == myLength;
	}
	
	// We will use this as a helper method as well. Dynamically increase the size of the array. 
	
	private void doubleLength() {
		// Make a copy of the array using the copyOf method. New copy will be twice as long. 
		arr = Arrays.copyOf(arr, (arr.length*2));
	}
	
	
	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
			
		}
		//loop backwards and shift items over to make room for new data, then assign it to 0 index
		for (int i = myLength; i > 0; i--) {
			arr[i] = arr[i-1]; //This is assigning the element that was before it to the new index
	
		}
		arr[0] = data;
		myLength++;
	}

	@Override
	public void removeFromBeginning() {
	for (int i = 0; i < myLength; i++){
		
		
	}
		
	}

	@Override
	public void addAtEnd(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFromEnd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return arr[index];
	}

	@Override
	public int size() {
	
		
		return myLength;
	}
	
	@Override
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		for(int i = 0; i < myLength; i++) {
			sb.append(arr[i]);
			if (i != myLength -1 ) {
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

}
