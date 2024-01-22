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
        assertEquals(-1, testArrayIntList.indexOf(33));
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