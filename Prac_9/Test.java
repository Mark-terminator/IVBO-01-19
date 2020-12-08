package Prac_9;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
public class Test {
    public static void main(String arg[]) throws INNException{
        ArrayList<Customers> mass = new ArrayList<Customers>();
        Customers chelik;
        int INN;
        Scanner sc = new Scanner(System.in);
        String full_name;
        System.out.println("Введите ИНН и ФИО клиентов");
        for(int i = 0; i < 5; i++){
            INN = sc.nextInt();
            full_name = sc.nextLine();
            full_name = sc.nextLine();
            mass.add(new Customers(INN,full_name));
        }
        System.out.println("Введите ИНН и ФИО");
        INN = sc.nextInt();
        full_name = sc.nextLine();
        full_name = sc.nextLine();
        try{
            for(int i = 0; i < 5; i++){
                chelik = mass.get(i);
               if(full_name.equals(chelik.getFull_name()) ) {
                    if(chelik.getINN() != INN) throw new IllegalArgumentException();
               }
            }
        }
        catch(IllegalArgumentException e){
            throw new INNException(e, "Incorrect INN");
        }
    }
}
