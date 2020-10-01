package Prac_5;
import java.util.Scanner;

public class Prac_5 {
    public String ex_3(int A, int B, boolean f, String s){
        if(f) {
            if(A > B) return s;
            for (int i = 0; i < A; i++) {
                s += A + " ";
            }
            return ex_3(A + 1, B, f, s);
        }
        else{
            if(A < B) return s;
            for (int i = 0; i <= A; i++) {
                s += A + " ";
            }
            return ex_3(A - 1, B, f, s);
        }
    }
    public int ex_4(int k, int s, int x, int count){
        if(x == Math.pow(10, k)) return count;
            int sum = 0;
        int x_here = x;
        while(x_here > 0){
            sum += x_here % 10;
            x_here /= 10;
        }
        if(sum == s)
            count++;
        return ex_4(k, s, x + 1, count);
    }
    public int ex_5(int x, int sum){
        if(x == 0) return sum;
        sum += x % 10;
        return ex_5(x /= 10, sum);
    }
    public String ex_6(int x, int count){
        if(count == x) return "YES";
        if(x / count == 0) return "NO";
        return ex_6(x, count +=1);
    }
}
