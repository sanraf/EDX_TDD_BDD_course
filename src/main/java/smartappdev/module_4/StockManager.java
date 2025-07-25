package smartappdev.module_4;

import java.util.HashMap;
import java.util.Map;

public class StockManager {
    private final Map<String, Integer> stock = new HashMap<>();

    public void setStock(String item, int quantity) {
        stock.put(item, quantity);
    }

    public void returnItem(String item) {
        stock.put(item, stock.getOrDefault(item, 0) + 1);
    }

    public int getStock(String item) {
        return stock.getOrDefault(item, 0);
    }
}

