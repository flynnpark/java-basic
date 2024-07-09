package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 갯수를 입력하세요: ");
        int orderCount = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[orderCount];
        for (int i = 0; i < orderCount; i++) {
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalPrice = getTotalPrice(orders);
        System.out.println("Total price: " + totalPrice);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName + ": " + order.price + " * " + order.quantity);
        }
    }

    static int getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}
