public class ShopManager {
    public static double purchaseProduct(int productId, int quantity)
            throws ProductNotFoundException, InsufficientQuantityException {
        Product product = ProductDatabase.getProduct(productId);

        if (product == null) {
            throw new ProductNotFoundException("Извините, но продукт с ID " + productId + " не найден.");
        }

        if (quantity > product.getAvailableQuantity()) {
            throw new InsufficientQuantityException(
                    "Извините, но недостаточное количество товара: " + product.getName());
        }

        double totalPrice = product.getPrice() * quantity;
        // Simulate updating available quantity in the database
        product.decreaseQuantity(quantity);
        return totalPrice;
    }
}