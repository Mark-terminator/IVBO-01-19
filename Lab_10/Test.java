package Lab_10;

import java.util.ArrayList;

public class Test {
    public static void main(String arg[]){
        Ex1 o1 = new Ex1();
        Ex2 o2 = new Ex2();
        Ex3 o3 = new Ex3();
        Integer[] mass = {0,1,1,2,3,0,0,0,10,3};
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls = o1.massToList(mass);
        for(Integer i: ls) System.out.println(i);
        o2.intoMass(mass);
        System.out.println(o3.getObject(mass, 3));
    }

}
