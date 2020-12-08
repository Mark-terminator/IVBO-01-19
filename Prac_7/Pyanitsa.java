package Prac_7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Pyanitsa {
    public Pyanitsa(String str_1, String str_2){
        ArrayDeque<Character> deque_1 = new ArrayDeque<Character>();
        ArrayDeque<Character> deque_2 = new ArrayDeque<Character>();
        char ch1, ch2;
        int count = 0;
        for(int i = 0; i < 5; i++){
            ch1 = str_1.charAt(i);
            deque_1.add(ch1);
            ch2 = str_2.charAt(i);
            deque_2.add(ch2);
        }
        while(count != 106){
            if((deque_1.size() == 0) || (deque_2.size() == 0)){
                if(deque_1.size() == 0) System.out.println("second " + count);
                else System.out.println("first " + count);
                return;
            }
            else{
                if(((deque_1.getFirst()>deque_2.getFirst()) && !((deque_1.getFirst() == '9') && (deque_2.getFirst() == '0'))) || ((deque_1.getFirst() == '0') && (deque_2.getFirst() == '9'))){
                    deque_1.addLast(deque_1.getFirst());
                    deque_1.addLast(deque_2.getFirst());
                    deque_1.pollFirst();
                    deque_2.pollFirst();
                }
                else{
                    deque_2.addLast(deque_2.getFirst());
                    deque_2.addLast(deque_1.getFirst());
                    deque_1.pollFirst();
                    deque_2.pollFirst();
                }
                count++;
            }

        }
        System.out.println("botva");
    }
}
