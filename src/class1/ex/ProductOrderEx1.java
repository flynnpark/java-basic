package class1.ex;

public class ProductOrderEx1 {
    public static void main(String[] args){
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "컵라면";
        order1.price = 800;
        order1.quantity = 3;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "햇반";
        order2.price = 1200;
        order2.quantity = 2;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "라면";
        order3.price = 1000;
        order3.quantity = 4;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            int amount = order.price * order.quantity;
            totalAmount += amount;
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity + ", 금액: " + amount);
        }

        System.out.println("총 금액: " + totalAmount);
    }
}
