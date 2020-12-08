package Practice_6;

public class Test {
    public static void main(String arg[]){
        int mass;
        SortingStudentsByGPA ob1 = new SortingStudentsByGPA();
        Student students[] = new Student[5];
        Student student;
        for(int i = 0; i < 5; i++){
            student = new Student(56+(int)(Math.random()*9));
            students[i] = student;
        }
        for(int i = 0; i < 5; i++){
            System.out.println(students[i].getBall());

        }
        System.out.println();
        ob1.sortirovka(students,0,4);
        for(int i = 0; i < 5; i++){
            System.out.println(students[i].getBall());
        }
    }
}
