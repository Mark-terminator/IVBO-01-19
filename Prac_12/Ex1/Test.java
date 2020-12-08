package Prac_12.Ex1;

public class Test {
    public static void main(String arg[]){
        String f;
        Person p1 = new Person("Ivanov", "", "Ivanovich");
        try{
            f = p1.get_Name();
            System.out.println(f);
        }
        catch (IllegalArgumentException e){
            System.out.println("Sorry");
        }
    }
}
