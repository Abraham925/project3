package hmllm;

import java.util.Iterator;

/**
 * HomemadeLLMap
 * 
 * An implementation of the HomemadeMap class that uses
 * a completely-homemade linked list on the inside.
 * 
 * @author Thomas VanDrunen, Abraham Austin
 * CSCI 245, Wheaton College
 * June 30, 2014
 * Feb 24, 2022
 */

public class HomemadeLLMap implements HomemadeMap {
	
    /**
     * The first Node in this list.
     */
    private Node head;
    
    /**
     * Constructor.
     * POSTCONDITION: This list is empty.
     */
    public HomemadeLLMap() {
    	head = null;
    }
	
    /**
     * Test whether an association exists for this key.
     * @param key The key to remove
     * @return true if there is an association for this key, false otherwise
     */
    public boolean containsKey(String key) {
    	if(helper(key)!=null) {
    		return true;
    	}
    	else {
    		return false;
    	}

    }
   

    /**
     * Add an association to the map.
     * @param key The key to this association
     * @param val The value to which this key is associated
     */
    public void put(String key, String value) {
    	if(helper(key)==null) {
    		head = new Node(key, value, head);
    	}
    	else if(helper(key).value().equals(value) == false){ 	
    		remove(helper(key).key());
    		head = new Node(key, value, head);
    	}
    }  

    /**
     * Get the value for a key.
     * @param key The key whose value we're retrieving.
     * @return The value associated with this key, null if none exists
     */
    public String get(String key) {
    	if(helper(key)!=null) {
    		return helper(key).value();
    	}
    	else {
    		return null;
    	}
    }

    /**
     * Get an iterator for all the keys in this map.
     * @return An iterator over the set of keys.
     */
    public Iterator<String> keyIterator() {
    	MapIterator x = new MapIterator(head);
    	return x;
    }

    
    /**
     * Remove the association for this key.
     * @param key The key to remove
     */   
    public void remove(String key) {
    	Node place = head;   
    	Node previous = null; 
    	
    	while (place != null) {
    	    if (place.key().equals(key)) {
	    	    if(head.key().equals(key)){
	    		    head = head.next();
	    		    return;
	    		}
	    	    else{
	    	         previous.setNext(place.next());
	    		}
    	
	    	    return;
    	    }
    	    previous = place;
    	    place = place.next();
    	}
    }
    
    /**
     * Helper method to iterate through the LinkedMap
     */   
    private Node helper(String key) {
    	Node place = head; 
    	while(place != null) {
    	    if((place.key()).equals(key)){
    	    	return place;
    	    }
    	    place = place.next();
    	}
    	return null;
    	
    }

	
}
