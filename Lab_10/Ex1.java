package Lab_10;

import java.util.ArrayList;

public class Ex1 {
    public static <E>  ArrayList<E> massToList(E[] mass){
        ArrayList<E> ls = new ArrayList<E>();
        for(E e: mass){
            ls.add(e);
        }
        return ls;
    }
}
