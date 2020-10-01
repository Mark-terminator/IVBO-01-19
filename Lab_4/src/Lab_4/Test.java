package Lab_4;

public class Test {
    public static void main(String arg[]){
        Priceable ob1 = new Chereshnya(45);
        System.out.println(ob1.getPrice());
        ob1 = new Holodec(100);
        System.out.println(ob1.getPrice());
        Pochka ob2 = new Pochka(999999);
        System.out.println(ob2.getPrice());
    }
}
