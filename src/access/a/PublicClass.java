package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 {}

class DefaultClass2 {}

/*
 * - 클래스 레벨의 접근 제어자는 public, default만 사용할 수 있다.
 *   - private, protected는 사용할 수 없다.
 * - public 클래스는 반드시 파일명과 이름이 같아야 한다.
 *   - 하나의 자바 파일에 public 클래스는 하나만 등장할 수 있다.
 *   - 하나의 자바 파일에 default 접근 제어자를 사용하는 클래스는 무한정
 */
