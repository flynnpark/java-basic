package class1;

public class ClassStart5 {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "홍길동";
        student1.age = 20;
        student1.grade = 3;

        Student student2 = new Student();
        student2.name = "김철수";
        student2.age = 30;
        student2.grade = 4;

        Student[] students = new Student[]{student1, student2};

        for (Student student : students) {
            System.out.println("이름: " + student.name);
            System.out.println("나이: " + student.age);
            System.out.println("학년: " + student.grade);
            System.out.println();
        }
  }
}
