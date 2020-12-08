package Prac_9;

public class Customers {
    private int INN;
    private String full_name;

    public Customers(int INN, String full_name){
        this.INN = INN;
        this.full_name = full_name;
    }

    public int getINN() {
        return INN;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setINN(int INN) {
        this.INN = INN;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
