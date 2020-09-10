public class TestDog {
    public static void main(String[] args) {
        Dog ob1 = new Dog(5, "Drujok");
        ob1.to_String();
        System.out.println("Age in human years: " + ob1.inHumanYears());
        Pitomnic ob2 = new Pitomnic();
        ob2.newDog(ob1);
        ob1.to_String();
    }
}
