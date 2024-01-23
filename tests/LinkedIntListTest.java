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
        testLinkedIntList.addFront(FILLER_VALUE);

        // add test value
        testLinkedIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testLinkedIntList.get(FIRST_INDEX));
    }

    @Test
    void addFront_listContainsMultipleNodes_addedSuccessfully() {
        // add several initial values
        testLinkedIntList.addFront(FILLER_VALUE);
        testLinkedIntList.addFront(FILLER_VALUE);
        testLinkedIntList.addFront(FILLER_VALUE);

        // add test value
        testLinkedIntList.addFront(TEST_VALUE);

        // ensure expected value is at index 0
        assertEquals(TEST_VALUE, testLinkedIntList.get(FIRST_INDEX));
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