package class1;

public class ClassStart4 {
    public static void main(String[] args){
        Student[] students = new Student[2];

        students[0] = new Student();
        students[1] = new Student();

        students[0].name = "홍길동";
        students[0].age = 20;
        students[0].grade = 3;

        students[1].name = "김철수";
        students[1].age = 30;
        students[1].grade = 4;

        for(int i=0; i<students.length; i++){
            System.out.println("이름: " + students[i].name);
            System.out.println("나이: " + students[i].age);
            System.out.println("학년: " + students[i].grade);
            System.out.println();
        }
  }
}

/*
 * 변수에는 인스턴스 자체가 들어있는 것이 아니다. 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다. 따라서 대입(=)시에 인스턴스가 복제되는 것이 아니라 참조값이 복제된다.
 * 자바에서의 대입은 항상 변수에 들어있는 값을 복사해서 전달한다.
 */