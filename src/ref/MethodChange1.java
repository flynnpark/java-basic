package ref;

public class MethodChange1 {
    public static void main(String[] args){
        int a = 10;
        System.out.println("메서드 호출 전 a 값: " + a);

        change(a);
        System.out.println("메서드 호출 후 a 값: " + a);
    }

    public static void change(int a){
        a = 20;
    }
}
