public class Product {
    private int productId;
    private String name;
    private int availableQuantity;
    private double price;

    public Product(int productId, String name, int availableQuantity, double price) {
        this.productId = productId;
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void decreaseQuantity(int quantity) {
        this.availableQuantity -= quantity;
    }
}