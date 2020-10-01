package Prac_5;

import java.util.Scanner;

public class Test {
    public static void main(String arg[]){
        int A, B;
        boolean f;
        String s = "";
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        f = A < B;
        Prac_5 ob = new Prac_5();
        System.out.println(ob.ex_3(A, B, f, s =""));

        A = in.nextInt();
        B = in.nextInt();
        System.out.println(ob.ex_4(A, B, (int)Math.pow(10, A - 1), 0));

        A = in.nextInt();
        System.out.println(ob.ex_5(A, 0));

        A = in.nextInt();
        System.out.println(ob.ex_6(A, 1));
    }
}
