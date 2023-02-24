package hmllm;

/**
 * @author abrahamaustin/In-class example
 *
 */
public class Node {
	 /**
     * The value for this node.  (Note that it is immutable.)
     */
    private final String value;
    
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
     * @param value The value for this Node.
     * @param next  The node that follows this one.
     */
    public Node(String key, String value, Node next) {
    	this.key = key;
        this.value = value;
        this.next = next;
    }

    /* accessor methods */
    public String value() { return value; }
    public String key() {return key;}
    public Node next() { return next; }
    
    /* mutator method */
    public void setNext(Node next) { this.next = next; }
}



