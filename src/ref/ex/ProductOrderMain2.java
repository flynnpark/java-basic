package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args){
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("Apple", 1000, 3);
        orders[1] = createOrder("Banana", 500, 2);
        orders[2] = createOrder("Cherry", 2000, 1);

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
