import java.util.Scanner;

public class OnlineShopUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ID продукта: ");
        int productId = scanner.nextInt();
        System.out.print("Введите количество: ");
        int quantity = scanner.nextInt();

        try {
            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Общая стоимость: $" + totalPrice);
        } catch (ProductNotFoundException | InsufficientQuantityException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}