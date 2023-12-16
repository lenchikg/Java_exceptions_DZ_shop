import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Product 1", 10, 5.99));
        // Add more products if needed
    }

    public static Product getProduct(int productId) {
        return products.get(productId);
    }
}