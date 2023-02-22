/**
 * 
 */

/**
 * @author abrahamaustin/In-class example
 *
 */
public class Node {
	 /**
     * The payload for this node.  (Note that it is immutable.)
     */
    private final String datum;
    
	 /**
     * The key for this node.  (Note that it is immutable.)
     */
    private final String key;
    /**
     * The node following this one.
     */
    private Node next;

    /**
     * Constructor.
     * @param datum The payload for this INode.
     * @param next  The node that follows this one.
     */
    public Node(String datum, String key, INode next) {
    	this.key = key;
        this.datum = datum;
        this.next = next;
    }

    /* accessor methods */
    public String datum() { return datum; }
    public String key() {return key;}
    public INode next() { return next; }
    
    /* mutator method */
    public void setNext(INode next) { this.next = next; }
}


}
