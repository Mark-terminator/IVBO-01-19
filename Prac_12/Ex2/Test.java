package Prac_12.Ex2;

import java.util.Scanner;

public class Test {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        Address ob = new Address(str);
        System.out.println(ob.toString());
        str = sc.nextLine();
        AddressFull ob1 = new AddressFull(str);
        System.out.println(ob1.toString());
    }
}
