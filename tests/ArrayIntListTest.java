import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayIntListTest {
    /**
     * Create ArrayIntList at start
     */
    private ArrayIntList testArrayIntList = new ArrayIntList();

    /**
     * The default max capacity of buffer, at creation
     */
    private final int DEFAULT_BUFFER_LENGTH = 10;

    /**
     * The first index in buffer is 0
     */
    private final int FIRST_INDEX = 0;

    /**
     * The value returned by methods if value not found
     */
    private final int INVALID_INDEX = -1;

    /**
     * The standard filler value added to buffer prior to testing method
     */
    private final int FILLER_VALUE = 5;

    /**
     * The standard value used to test methods
     */
    private final int TEST_VALUE = 20;

    @Test
    void addFront_bufferContainsOneValue_addedSuccessfully() {
        // add initial value
        testArrayIntList.addBack(FILLER_VALUE);

        // add expected value to front
        testArrayIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testArrayIntList.get(FIRST_INDEX));
    }

    @Test
    void addFront_bufferContainsMultipleValues_addedSuccessfully() {
        // add several initial values
        testArrayIntList.addBack(FILLER_VALUE);
        testArrayIntList.addBack(FILLER_VALUE);
        testArrayIntList.addBack(FILLER_VALUE);

        // add expected value to front
        testArrayIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testArrayIntList.get(FIRST_INDEX));
    }

    @Test
    void addFront_bufferEmpty_addedSuccessfully() {
        testArrayIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testArrayIntList.get(FIRST_INDEX));
    }

    @Test
    void addFront_bufferFull_addedSuccessfully() {
        // add 10 values to buffer
        for(int i = 0; i < DEFAULT_BUFFER_LENGTH; i++) {
            testArrayIntList.addBack(FILLER_VALUE);
        }

        // add 11th value to front
        testArrayIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testArrayIntList.get(FIRST_INDEX));

    }

    @Test
    void addBack_bufferContainsOneValue_addedSuccessfully() {
        // add initial value
        testArrayIntList.addFront(FILLER_VALUE);

        // add expected value to back
        testArrayIntList.addBack(TEST_VALUE);

        // ensure expected value is at final index
        assertEquals(TEST_VALUE, testArrayIntList.get(testArrayIntList.size() - 1));
    }

    @Test
    void addBack_bufferContainsMultipleValues_addedSuccessfully() {
        // add several initial values
        testArrayIntList.addFront(FILLER_VALUE);
        testArrayIntList.addFront(FILLER_VALUE);
        testArrayIntList.addFront(FILLER_VALUE);

        // add expected value to back
        testArrayIntList.addBack(TEST_VALUE);

        // ensure expected value is at final index
        assertEquals(TEST_VALUE, testArrayIntList.get(testArrayIntList.size() - 1));
    }

    @Test
    void addBack_bufferEmpty_addedSuccessfully() {
        testArrayIntList.addBack(TEST_VALUE);

        // ensure the expected value is at final index
        assertEquals(TEST_VALUE, testArrayIntList.get(testArrayIntList.size() - 1));
    }

    @Test
    void addBack_bufferFull_addedSuccessfully() {
        // add 10 values to buffer
        for(int i = 0; i < DEFAULT_BUFFER_LENGTH; i++) {
            testArrayIntList.addFront(FILLER_VALUE);
        }

        // add 11th value to back
        testArrayIntList.addBack(TEST_VALUE);

        // ensure expected value is at final index
        assertEquals(TEST_VALUE, testArrayIntList.get(testArrayIntList.size() - 1));

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
    void contains() {

    }

    @Test
    void indexOf_valueExists_returnsCorrectIndex() {
        // add expected value to front
        testArrayIntList.addFront(TEST_VALUE);

        assertEquals(FIRST_INDEX, testArrayIntList.indexOf(TEST_VALUE));
    }

    @Test
    void indexOf_valueInvalid_returnsNegativeOne() {
        // add values so the buffer is not empty
        testArrayIntList.addFront(FILLER_VALUE);
        testArrayIntList.addFront(FILLER_VALUE);
        testArrayIntList.addFront(FILLER_VALUE);

        assertEquals(INVALID_INDEX, testArrayIntList.indexOf(TEST_VALUE));
    }

    @Test
    void indexOf_emptyBuffer_returnsNegativeOne() {
        assertEquals(INVALID_INDEX, testArrayIntList.indexOf(TEST_VALUE));
    }

    @Test
    void isEmpty() {
    }

    @Test
    void size() {
    }

    @Test
    void clear() {
    }

    @Test
    void iterator() {
    }
}