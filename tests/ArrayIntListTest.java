import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayIntListTest {
    /**
     * Create ArrayIntList at start
     */
    private ArrayIntList testArrayIntList = new ArrayIntList();

    @Test
    void addFront_bufferContainsOneValue_addedSuccessfully() {
        // add initial value
        testArrayIntList.addBack(5);

        // add expected value to front
        testArrayIntList.addFront(20);

        // ensure expected value is at index 0
        assertEquals(20, testArrayIntList.get(0));
    }

    @Test
    void addFront_bufferContainsMultipleValues_addedSuccessfully() {
        // add several initial values
        testArrayIntList.addBack(5);
        testArrayIntList.addBack(10);
        testArrayIntList.addBack(15);

        // add expected value to front
        testArrayIntList.addFront(20);

        // ensure expected value is at index 0
        assertEquals(20, testArrayIntList.get(0));
    }

    @Test
    void addFront_bufferEmpty_addedSuccessfully() {
        testArrayIntList.addFront(5);

        // ensure expected value is at index 0
        assertEquals(5, testArrayIntList.get(0));
    }

    @Test
    void addFront_bufferFull_addedSuccessfully() {
        // add 10 values to buffer
        for(int i = 0; i < 10; i++) {
            testArrayIntList.addBack(i * 5);
        }

        // add 11th value to front
        testArrayIntList.addFront(55);

        // ensure expected value is at index 0
        assertEquals(55, testArrayIntList.get(0));

    }

    @Test
    void addBack_bufferContainsOneValue_addedSuccessfully() {
        // add initial value
        testArrayIntList.addFront(5);

        // add expected value to back
        testArrayIntList.addBack(20);

        // ensure expected value is at final index
        assertEquals(20, testArrayIntList.get(testArrayIntList.size() - 1));
    }

    @Test
    void addBack_bufferContainsMultipleValues_addedSuccessfully() {
        // add several initial values
        testArrayIntList.addFront(5);
        testArrayIntList.addFront(10);
        testArrayIntList.addFront(15);

        // add expected value to back
        testArrayIntList.addBack(20);

        // ensure expected value is at final index
        assertEquals(20, testArrayIntList.get(testArrayIntList.size() - 1));
    }

    @Test
    void addBack_bufferEmpty_addedSuccessfully() {
        testArrayIntList.addBack(5);

        // ensure the expected value is at final index
        assertEquals(5, testArrayIntList.get(testArrayIntList.size() - 1));
    }

    @Test
    void addBack_bufferFull_addedSuccessfully() {
        // add 10 values to buffer
        for(int i = 0; i < 10; i++) {
            testArrayIntList.addFront(i * 5);
        }

        // add 11th value to back
        testArrayIntList.addBack(55);

        // ensure expected value is at final index
        assertEquals(55, testArrayIntList.get(testArrayIntList.size() - 1));

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
        testArrayIntList.addFront(5);

        assertEquals(0, testArrayIntList.indexOf(5));
    }

    @Test
    void indexOf_valueInvalid_returnsNegativeOne() {
        // add values so the buffer is not empty
        testArrayIntList.addFront(5);
        testArrayIntList.addFront(10);

        assertEquals(-1, testArrayIntList.indexOf(15));
    }

    @Test
    void indexOf_emptyBuffer_returnsNegativeOne() {
        assertEquals(-1, testArrayIntList.indexOf(15));
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