package yogaharis.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void test1() {
        boolean isDuplicate = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1});
        assertTrue(isDuplicate);
    }

    @Test
    void test2() {
        boolean isDuplicate = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4});
        assertFalse(isDuplicate);
    }

    @Test
    void test3() {
        boolean isDuplicate = containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        assertTrue(isDuplicate);
    }
}