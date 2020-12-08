package Prac_12.Ex3;

public class Shirt {
    String number;
    String name;
    String color;
    String size;
    public Shirt(String str){
        String[] st = new String[4];
        st = str.split(",");
        number = st[0];
        name = st[1];
        color = st[2];
        size = st[3];
    }
    public String toString(){
        return number + " " + name + " " + color + " " + size;
    }
}
