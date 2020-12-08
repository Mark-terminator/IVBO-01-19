package Prac_10;

public class Client {
    public Chair chair;
    public void sit(Chair chair){
        System.out.println("I sit on " + chair.getClass());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
