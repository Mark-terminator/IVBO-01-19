package Lab_7;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String arg[]){
        ArrayList<Students> students = new ArrayList<Students>();
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        for(int i = 0; i < 5; i++){
            name = scanner.nextLine();
            age = scanner.nextInt();
            scanner.nextLine();
            students.add(new Students(name,age));
        }
        students.add(new Students("Cергей", 18));
        students.add(4,new Students("Алексей Навальный",2018));
        System.out.println(students.get(4).getName());
        students.set(0, new Students("Владимир Путин",68));
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName() + " " + students.get(i).getAge());
        }
        students.remove(4);
        System.out.println(students.get(4).getName());
        students.subList(0,2);
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName() + " " + students.get(i).getAge());
        }
    }
}
