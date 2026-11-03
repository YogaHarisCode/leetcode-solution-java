package yogaharis.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimetoBuyandSellStockTest {

    private BestTimetoBuyandSellStock bestTimetoBuyandSellStock;

    @BeforeEach
    void setUp() {
        bestTimetoBuyandSellStock = new BestTimetoBuyandSellStock();
    }

    @Test
    void test1() {
        int maxProfit = bestTimetoBuyandSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        assertEquals(5, maxProfit);
    }

    @Test
    void test2() {
        int maxProfit = bestTimetoBuyandSellStock.maxProfit(new int[]{7, 6, 4, 3, 1});

        assertEquals(0, maxProfit);
    }
}