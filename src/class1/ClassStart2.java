package class1;

public class ClassStart2 {
    public static void main(String[] args){
        String[] studentNames = {"John", "Jane"};
        int[] studentAges = {20, 21};
        int[] studentGrades = {85, 90};

        for(int i = 0; i < studentNames.length; i++){
            System.out.println("Student " + (i + 1) + ": " + studentNames[i] + " is " + studentAges[i] + " years old and has a grade of " + studentGrades[i]);
        }
    }
}
