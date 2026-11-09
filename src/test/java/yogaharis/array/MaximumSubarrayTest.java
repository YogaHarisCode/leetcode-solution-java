package yogaharis.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @BeforeEach
    void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    void test1() {
        int maxSub = maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        assertEquals(6, maxSub);
    }

    @Test
    void test2() {
        int maxSub = maximumSubarray.maxSubArray(new int[]{1});

        assertEquals(1, maxSub);
    }

    @Test
    void test3() {
        int maxSub = maximumSubarray.maxSubArray(new int[]{5, 4, -1, 7, 8});

        assertEquals(23, maxSub);
    }
}