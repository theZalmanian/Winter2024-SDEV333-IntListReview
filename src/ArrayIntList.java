import java.util.Iterator;

public class ArrayIntList implements IntList {
    /**
     * An array with a max capcity of 10 values
     */
    private int[] buffer;

    /**
     * The number of values stored within the buffer
     */
    private int size;

    /**
     * Constructs an ArrayIntList with an empty buffer with a max capacity of 10 values
     */
    public ArrayIntList() {
        // setup used capacity of array as 0
        size = 0;

        // setup buffer with default length of 10
        buffer = new int[10];
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
        // if size is equal to length, increase buffer length
        resizeWhenNeeded();

        // run through array backwards
        for(int i = size; i >= 0; i--) {
            // get value at previous index and place in current index
            buffer[i] = buffer[i - 1];
        }

        // add the given value at now empty position 0
        buffer[0] = value;

        // increase size as one more value is in buffer
        size++;
    }

    /**
     * Appends (inserts) the specified value at the back of the list (at index size()-1).
     *
     * @param value value to be inserted
     */
    @Override
    public void addBack(int value) {
        // if size is equal to length, increase buffer length
        resizeWhenNeeded();

        // add the given value at the last unused index of buffer
        buffer[size] = value;

        // increment the size as one more value is stored in buffer
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
        // if size is equal to length, increase buffer length
        resizeWhenNeeded();

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
        // if given index is out of range, throw IndexOutOfBoundsException
        if(index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds: must be greater than 0");
        }

        else if(index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: must be less than size");
        }

        // get the value at given index of buffer
        int requestedValue = buffer[index];

        // run through array, starting at given index, going up to size,
        // accounting for removal of requested value
        for(int i = index; i <= size - 1; i++) {
            // place the value at next index in current index
            buffer[i] = buffer[i + 1];
        }

        // decrement size as value has been removed
        size--;

        // return the requested value
        return requestedValue;
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
        return size <= 0;
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
        // create empty array with the given length
        buffer = new int[buffer.length];

        // set the size to 0, it is now empty
        size = 0;
    }


    /**
     * Increases the length of the ArrayIntLists buffer by the given value
     */
    private void resize(int newSize) {
        // create a new buffer, with double the capacity of the existing buffer
        int[] newBuffer = new int[newSize];

        // run through previous buffer and copy over all values
        for(int i = 0; i < buffer.length; i++) {
            newBuffer[i] = buffer[i];
        }

        // replace buffer with newBuffer, containing all the same values,
        // and at double the length
        buffer = newBuffer;
    }

    /**
     * If the array has no more remaining space, double its max capacity
     */
    private void resizeWhenNeeded() {
        // if there is no more space left
        if(size == buffer.length) {
            // double the maximum capacity of the array
            resize(buffer.length * 2);
        }
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