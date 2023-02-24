package hmllm;

import java.util.Iterator;

public class MapIterator implements Iterator<E> {

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
    	Node place = head; 
    	while(place != null) {
    		place = place.next();
    	}
    	return false;
	}

	@Override
	public E next() {
		if(hasNext()) {
	

		}
		return null;
	}

}
