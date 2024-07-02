package class1;

public class ClassStart3 {
    public static void main(String[] args){
        Student student1 = new Student(); // new 키워드로 Student 클래스의 인스턴스 생성이 되고 나면 student1 변수에는 Student 클래스의 인스턴스의 주소값이 저장된다.
        student1.name = "John";
        student1.age = 15;
        student1.grade = 9;

        /*
         * 참조값을 변수에 보관해야 하는 이유
         *
         * 객체를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다. 이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다. 따라서 생성한 객체에 접근할 수 있는 방법이 필요하다.
         * 이런 이유로 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해야 한다. 이때 사용하는 것이 변수이다. 변수에 참조값을 저장하면 그 변수를 통해 객체에 접근할 수 있다.
         */

        Student student2 = new Student();
        student2.name = "Jane";
        student2.age = 16;
        student2.grade = 10;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 학년: " + student1.grade);
        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 학년: " + student2.grade);
  }
}


/*
 * 클래스
 * 클래스는 객체를 생성하기 위한 틀 또는 설계도이다. 클래스는 객체가 가져야 할 속성(변수)과 기능(메서드)을 정의한다.
 *
 * 객체
 * 객체는 클래스에서 정의한 속성과 기능을 가진 실체이다. 객체는 서로 독립적인 상태를 가진다.
 *
 * 인스턴스
 * 인스턴스는 특정 클래스로부터 생성된 객체를 의미한다. 그래서 객체와 인스턴스라는 용어는 자주 혼용된다. 인스턴스는 주로 객체가 어떤 클래스에 속해 있는지를 강조할 때 사용된다.
 *
 * 객체 vs 인스턴스
 * 둘 다 클래스에서 나온 실체라는 의미에서 비슷하게 사용되지만, 용어상 인스턴스는 객체보다 좀 더 관계에 촛점을 맞춘 단어이다. 모든 인스턴스는 객체이지만, 우리가 인스턴스라고 부르는 순간은 특정 클래스로부터 그 객체가 생성되었
 */