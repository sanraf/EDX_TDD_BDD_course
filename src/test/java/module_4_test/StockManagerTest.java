package module_4_test;


import org.junit.jupiter.api.Test;
import smartappdev.module_4.StockManager;

import static org.junit.jupiter.api.Assertions.*;

public class StockManagerTest {

    @Test
    public void testReturnItem() {
        StockManager manager = new StockManager();
        manager.setStock("black sweater", 3);
        manager.returnItem("black sweater");

        assertEquals(4, manager.getStock("black sweater"));
    }
}

