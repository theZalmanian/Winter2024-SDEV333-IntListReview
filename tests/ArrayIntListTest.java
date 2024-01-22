import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayIntListTest {
    /**
     * Static ArrayIntList so there is one version to test with
     */
    private static ArrayIntList testArrayIntList;

    /**
     * Set up the test ArrayIntList with basic values before tests are run
     */
    @BeforeAll
    static void setupArrayIntList() {
        testArrayIntList = new ArrayIntList();
    }

    @Test
    void addFront_bufferContainsOneValue_addedSuccessfully() {
        // add initial value
        testArrayIntList.addFront(5);

        // add expected value to front
        testArrayIntList.addFront(20);

        // ensure expected value is at index 0
        assertEquals(20, testArrayIntList.get(0));
    }

    @Test
    void addFront_bufferContainsMultipleValues_addedSuccessfully() {
        // add several initial values
        testArrayIntList.addFront(5);
        testArrayIntList.addFront(10);
        testArrayIntList.addFront(15);

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