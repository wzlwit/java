
package reverselinklist;

/**
 * @author Zhaolong
 */
public class Node {

    public int value;
    public Node next;

    public Node(int value, Node next) // dont use void here,because different objects
    {
        this.value = value;
        this.next = next;
    }
}
