package hmllm;

import java.util.Iterator;

/**
 * @author abrahamaustin
 *
 */

public class MapIterator implements Iterator<String> {
	
	private Node head;// first link in the linked map
	/**
	 * constructor
	 * @param head
	 */
	public MapIterator(Node head) {
		this.head = head;
	}

	@Override
	/**
	 * checks if head is null
	 * returns if head is null
	 */
	public boolean hasNext() {
    	return head != null;
	}

	@Override
	/**
	 * returns the head value and iterates to the next link
	 */
	public String next() {
		String place = head.key(); 
		head = head.next();
		return place;
		
	}

}
