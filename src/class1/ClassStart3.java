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
