package Human;

public class HumanTest {
    public static void main(String arg[]){
        Human ob1 = new Human(45, 34, 36);
        System.out.println(ob1.getLHead());
        System.out.println(ob1.getLLeg());
        System.out.println(ob1.getLHand());
        ob1.setLHead(46);
        ob1.setLLeg(35);
        ob1.setLHand(37);
        System.out.println(ob1.getLHead());
        System.out.println(ob1.getLLeg());
        System.out.println(ob1.getLHand());
    }
}
