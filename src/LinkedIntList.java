import java.util.Iterator;

/**
 * Getting practice with implementing a LinkedList type class
 * @author Zalman I.
 */
public class LinkedIntList implements IntList {
    /**
     * A storage container which contains a connection to another Node
     */
    private class Node {
        /**
         * The number stored within the Node
         */
        int data;

        /**
         * The node this Node is pointing to
         */
        Node next;
    }

    /**
     * The first Node of the current LinkedIntList
     */
    private Node head;

    /**
     * The number of Nodes contained within this LinkedIntList
     */
    private int size;

    /**
     * Constructs an empty LinkedIntList
     */
    public LinkedIntList() {
        // the LinkedIntList is empty
        head = null;

        // there are no values contained within this LinkedIntList
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
        // construct a new Node to hold given value
        Node newNode = new Node();
        newNode.data = value;

        // if the LinkedIntList is not empty
        if(head != null) {
            // point the newly created Node at head
            newNode.next = head;
        }

        // override head with newly created node (making it the first element in LinkedIntList)
        head = newNode;

        // a new element has been added, increment size
        size++;
    }

    /**
     * Appends (inserts) the specified value at the back of the list (at index size()-1).
     *
     * @param value value to be inserted
     */
    @Override
    public void addBack(int value) {
        // if the LinkedIntList is empty
        if(head == null) {
            // add current value in newly created head
            addFront(value);
        }

        else {
            // construct a new Node to hold given value
            Node newNode = new Node();
            newNode.data = value;

            // setup pointer
            Node pointer = head;

            // run through LinkedIntList, up to the last Node
            while(pointer.next != null) {
                pointer = pointer.next;
            }

            // point the last Node at the newly created Node
            pointer.next = newNode;

            // a new element has been added, increment size
            size++;
        }
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
        return size == 0;
    }

    /**
     * Returns the number of values in this list.
     *
     * @return the number of values in this list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Removes all the values from this list.
     * The list will be empty after this call returns.
     */
    @Override
    public void clear() {
        // reset head node and point it at nothing
        head.next = null;
        head = null;

        // set the size to 0, as there are no longer any values being tracked
        size = 0;
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
