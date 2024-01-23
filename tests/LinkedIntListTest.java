    import org.junit.jupiter.api.Test;

    import javax.naming.InitialContext;

    import static org.junit.jupiter.api.Assertions.*;

class LinkedIntListTest {
    /**
     * Create LinkedIntList at start
     */
    private final LinkedIntList testLinkedIntList = new LinkedIntList();

    /**
     * The first index in buffer is 0
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
    void addFront_listEmpty_addedSuccessfully() {
        // make test value new head
        testLinkedIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testLinkedIntList.get(FIRST_INDEX));
    }

    @Test
    void addFront_listContainsNode_addedSuccessfully() {
        // add initial values
        testLinkedIntList.addBack(FILLER_VALUE);

        // add test value
        testLinkedIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testLinkedIntList.get(FIRST_INDEX));
    }

    @Test
    void addFront_listContainsMultipleNodes_addedSuccessfully() {
        // add several initial values
        testLinkedIntList.addBack(FILLER_VALUE);
        testLinkedIntList.addBack(FILLER_VALUE);
        testLinkedIntList.addBack(FILLER_VALUE);

        // add test value
        testLinkedIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testLinkedIntList.get(FIRST_INDEX));
    }

    @Test
    void addBack_listEmpty_addedSuccessfully() {
        // make test value new tail
        testLinkedIntList.addBack(TEST_VALUE);

        // ensure expected value is at end of list
        assertEquals(TEST_VALUE, testLinkedIntList.get(testLinkedIntList.size() -1));
    }

    @Test
    void addBack_listContainsNode_addedSuccessfully() {
        // add initial value
        testLinkedIntList.addFront(FILLER_VALUE);

        // add test value
        testLinkedIntList.addBack(TEST_VALUE);

        // ensure expected value is at end of list
        assertEquals(TEST_VALUE, testLinkedIntList.get(testLinkedIntList.size() -1));
    }

    @Test
    void addBack_listContainsMultipleNodes_addedSuccessfully() {
        // add several initial values
        testLinkedIntList.addFront(FILLER_VALUE);
        testLinkedIntList.addFront(FILLER_VALUE);
        testLinkedIntList.addFront(FILLER_VALUE);

        // add test value
        testLinkedIntList.addBack(TEST_VALUE);

        // ensure expected value is at end of list
        assertEquals(TEST_VALUE, testLinkedIntList.get(testLinkedIntList.size() -1));
    }

    @Test
    void add_listEmpty_addedSuccessfully() {
        // add test value to list
        testLinkedIntList.add(FIRST_INDEX, TEST_VALUE);

        // ensure expected value is in list
        assertEquals(TEST_VALUE, testLinkedIntList.get(FIRST_INDEX));
    }

    @Test
    void add_listContainsNode_addedSuccessfully() {
        // add initial value
        testLinkedIntList.addFront(FILLER_VALUE);

        // add test value
        testLinkedIntList.add(FIRST_INDEX + 1, TEST_VALUE);

        // ensure expected value is at expected index
        assertEquals(TEST_VALUE, testLinkedIntList.get(1));
    }

    @Test
    void add_listContainsMultipleNodes_addedSuccessfully() {
        // add several initial values
        testLinkedIntList.addBack(FILLER_VALUE);
        testLinkedIntList.addBack(FILLER_VALUE);
        testLinkedIntList.addBack(FILLER_VALUE);

        // add test value
        testLinkedIntList.add(2, TEST_VALUE);

        // ensure expected value is at expected index
        assertEquals(TEST_VALUE, testLinkedIntList.get(2));
    }

    @Test
    void add_invalidIndexNegative_throwsException() {
        // setup flag
        boolean exceptionThrown = false;

        try {
            // attempt to add value at invalid index
            testLinkedIntList.add(-1, TEST_VALUE);
        }

        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }

        // check if exception was thrown
        assertTrue(exceptionThrown);
    }

    @Test
    void add_invalidIndexMoreThanSize_throwsException() {
        // setup flag
        boolean exceptionThrown = false;

        try {
            // attempt to add value at invalid index
            testLinkedIntList.add(1, TEST_VALUE);
        }

        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }

        // check if exception was thrown
        assertTrue(exceptionThrown);
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
    void indexOf() {
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
}