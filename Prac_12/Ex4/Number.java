package Prac_12.Ex4;

public class Number {
    private String number = "";
    public Number(String str){
        number =
                str.substring(0, str.length() - 10)
                + str.substring(str.length() - 10, str.length() - 10 + 3)
                + "-" + str.substring(str.length() - 10 + 3, str.length() - 10 + 6)
                + "-" + str.substring(str.length() - 4, str.length());
    }
    public String toString(){
        return number;
    }
}
