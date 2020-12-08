package Prac_10;

public class Test {
    public static void main(String arg[]){
        Client cl = new Client();
        FunctionalChair chair1 = (new ChairFactory()).createFunctionalChair();
        System.out.println(chair1.sum(1,2));

        VictorianChair chair2 = (new ChairFactory()).createVictorianChair(150);
        System.out.println(chair2.getAge());

        MagicChair chair3 = (new ChairFactory()).createMagicChair();
        chair3.doMagic();

        cl.sit(chair3);
    }
}
