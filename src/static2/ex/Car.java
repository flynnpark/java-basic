package static2.ex;

public class Car {
    String name;
    static int totalCount = 0;

    public Car(String name) {
        this.name = name;
        totalCount++;
    }

    public static void showTotalCars() {
        System.out.println("총 구매한 차량 수: " + totalCount);
    }
}
