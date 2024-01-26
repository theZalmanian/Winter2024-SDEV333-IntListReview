import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedIntListTest {
    /**
     * Create LinkedIntList at start
     */
    private final DoublyLinkedIntList testDoublyLinkedIntList = new DoublyLinkedIntList();

    /**
     * The first index in list is 0
     */
    private final int FIRST_INDEX = 0;

    /**
     * The value returned by methods if value not found
     */
    private final int INVALID_INDEX = -1;

    /**
     * The standard filler value added to container prior to testing method
     */
    private final int FILLER_VALUE = 5;

    /**
     * The standard value used to test methods
     */
    private final int TEST_VALUE = 20;

    @Test
    void addFront() {
    }

    @Test
    void addBack() {
    }

    @Test
    void add() {
    }

    @Test
    void removeFront() {
    }

    @Test
    void removeBack() {
    }

    @Test
    void remove() {
    }

    @Test
    void get() {
    }

    @Test
    void contains_valueInList_returnsTrue() {
        // add several initial values
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);

        // add value to check for
        testDoublyLinkedIntList.addBack(TEST_VALUE);

        // check if value is in list
        assertTrue(testDoublyLinkedIntList.contains(TEST_VALUE));
    }

    @Test
    void contains_valueNotInList_returnsFalse() {
        // add several initial values
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);

        // check if value is in list
        assertFalse(testDoublyLinkedIntList.contains(TEST_VALUE));
    }

    @Test
    void contains_listEmpty_returnsFalse() {
        assertFalse(testDoublyLinkedIntList.contains(TEST_VALUE));
    }

    @Test
    void indexOf_valueExists_returnsIndex() {
        // add expected value to front
        testDoublyLinkedIntList.addFront(TEST_VALUE);

        // check if index matches
        assertEquals(FIRST_INDEX, testDoublyLinkedIntList.indexOf(TEST_VALUE));
    }

    @Test
    void indexOf_valueInvalid_returnsInvalidIndexFlag() {
        // add values so list is not empty
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);

        // ensure invalid index flag returns
        assertEquals(INVALID_INDEX, testDoublyLinkedIntList.indexOf(TEST_VALUE));
    }

    @Test
    void indexOf_listEmpty_returnsInvalidIndexFlag() {
        assertEquals(INVALID_INDEX, testDoublyLinkedIntList.indexOf(TEST_VALUE));
    }

    @Test
    void isEmpty_listContainsMultipleNodes_returnsSize() {
        // add values so the list is not empty
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);

        // check if list is empty
        assertFalse(testDoublyLinkedIntList.isEmpty());
    }

    @Test
    void isEmpty_listEmpty_returnsSize() {
        // ensure list is empty
        assertTrue(testDoublyLinkedIntList.isEmpty());
    }

    @Test
    void size_listContainsMultipleNodes_returnsSize() {
        // add values so the list is not empty
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);

        assertEquals(3, testDoublyLinkedIntList.size());
    }

    @Test
    void size_listEmpty_returnsSize() {
        assertEquals(0, testDoublyLinkedIntList.size());
    }

    @Test
    void clear_listContainsMultipleNodes_clearsSuccessfully() {
        // add values so list is not empty
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);
        testDoublyLinkedIntList.addBack(FILLER_VALUE);

        // clear the list
        testDoublyLinkedIntList.clear();

        // ensure list is empty
        assertTrue(testDoublyLinkedIntList.isEmpty());
    }

    @Test
    void clear_listEmpty_clearsSuccessfully() {
        // clear the list
        testDoublyLinkedIntList.clear();

        // ensure list is empty
        assertTrue(testDoublyLinkedIntList.isEmpty());
    }
}