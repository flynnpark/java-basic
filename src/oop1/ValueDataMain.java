package oop1;

public class ValueDataMain {
    public static void main(String[] args){
        ValueData data = new ValueData();
        add(data);
        add(data);
        add(data);
        System.out.println("최종 값: " + data.value);
    }

    static  void add(ValueData data) {
        data.value++;
        System.out.println("값을 1 증가시킵니다. 현재 값: " + data.value);
    }
}
