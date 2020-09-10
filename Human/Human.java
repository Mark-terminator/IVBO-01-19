package Human;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
    public Human(double x, double y, double z){
        head = new Head(x);
        leg = new Leg(y);
        hand = new Hand(z);
    }
    public double getLHead(){
        return head.getL();
    }
    public double getLLeg(){
        return leg.getL();
    }
    public double getLHand(){
        return hand.getL();
    }

    public void setLHead(double x) {
        head.setL(x);
    }
    public void setLHand(double x) {
        hand.setL(x);
    }
    public void setLLeg(double x) {
        leg.setL(x);
    }
}
