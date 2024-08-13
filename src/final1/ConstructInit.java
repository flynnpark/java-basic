package final1;

public class ConstructInit {
    final int value; // 생성자를 통해서 초기화한 후에는 재할당 불가능

    public ConstructInit(int value) {
        this.value = value;
    }
}
