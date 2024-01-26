import java.util.Iterator;

/**
 * Getting practice with implementing a LinkedList type class that can be traversed both ways
 * @author Zalman I.
 */
public class DoublyLinkedIntList implements IntList {
    /**
     * A storage container which contains a connection to two adjacent Nodes
     */
    private static class Node {
        /**
         * The value stored within the Node
         */
        int data;

        /**
         * The Node this Node is pointing to
         */
        Node next;

        /**
         * The Node pointing at this Node
         */
        Node previous;

        /**
         * A newly created Node by default is not pointing to or being pointed at by any Nodes
         */
        public Node() {
            next = null;
            previous = null;
        }
    }

    /**
     * The Node pointing to the starting Node, first sentinel
     */
    private Node first;

    /**
     * The Node being pointed at by final Node, last sentinel
     */
    private Node last;

    /**
     * The number of Nodes contained within this DoublyLinkedIntList
     */
    private int size;

    /**
     * Constructs an empty DoublyLinkedIntList, with both sentinels pointing at each other
     */
    public DoublyLinkedIntList() {
         // setup both sentinel Nodes
        first = new Node();
        last = new Node();

        // point first sentinel to last sentinel
        first.next = last;

        // point last sentinel to first sentinel
        last.previous = first;

        // there are no numbers contained within this DoublyLinkedIntList
        size = 0;
    }

    /**
     * Prepends (inserts) the specified value at the front of the list (at index 0).
     * Shifts the value currently at the front of the list (if any) and any
     * subsequent values to the right.
     *
     * @param value value to be inserted
     */
    @Override
    public void addFront(int value) {

    }

    /**
     * Appends (inserts) the specified value at the back of the list (at index size()-1).
     *
     * @param value value to be inserted
     */
    @Override
    public void addBack(int value) {
        // construct a new Node to hold given value
        Node newNode = new Node();
        newNode.data = value;

        // track the last Node in DoublyLinkedIntList
        Node lastNode = last.previous;

        // point new Node at last sentinel and last Node
        newNode.next = last;
        newNode.previous = lastNode;

        // point last sentinel and last Node at new Node
        lastNode.next = newNode;
        last.previous = newNode;

        // account for new value being added
        size++;
    }

    /**
     * Inserts the specified value at the specified position in this list.
     * Shifts the value currently at that position (if any) and any subsequent
     * values to the right.
     *
     * @param index index at which the specified value is to be inserted
     * @param value value to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public void add(int index, int value) {

    }

    /**
     * Removes the value located at the front of the list
     * (at index 0), if it is present.
     * Shifts any subsequent values to the left.
     */
    @Override
    public void removeFront() {

    }

    /**
     * Removes the value located at the back of the list
     * (at index size()-1), if it is present.
     */
    @Override
    public void removeBack() {
        // if there are values within the DoublyLinkedIntList
        if(size > 0) {
            // track the last Node in the DoublyLinkedIntList
            Node lastNode = last.previous;

            // update the Node pointing to the last Node to point at post
            lastNode.previous.next = last;

            // update post to point at Node prior to last Node
            last.previous = lastNode.previous;

            // account for value being removed
            size--;
        }
    }

    /**
     * Removes the value at the specified position in this list.
     * Shifts any subsequent values to the left. Returns the value
     * that was removed from the list.
     *
     * @param index the index of the value to be removed
     * @return the value previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public int remove(int index) {
        return 0;
    }

    /**
     * Returns the value at the specified position in the list.
     *
     * @param index index of the value to return
     * @return the value at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public int get(int index) {
        return 0;
    }

    /**
     * Returns true if this list contains the specified value.
     *
     * @param value value whose presence in this list is to be searched for
     * @return true if this list contains the specified value
     */
    @Override
    public boolean contains(int value) {
        return false;
    }

    /**
     * Returns the index of the first occurrence of the specified value
     * in this list, or -1 if this list does not contain the value.
     *
     * @param value value to search for
     * @return the index of the first occurrence of the specified value in this list
     * or -1 if this list does not contain the value
     */
    @Override
    public int indexOf(int value) {
        return 0;
    }

    /**
     * Returns true if this list contains no values.
     *
     * @return true if this list contains no values
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns the number of values in this list.
     *
     * @return the number of values in this list
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * Removes all the values from this list.
     * The list will be empty after this call returns.
     */
    @Override
    public void clear() {

    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
