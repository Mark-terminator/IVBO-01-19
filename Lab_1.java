package com.company;

public class Lab_1 {
    public void N_1(){
        int[] mass = {1, 2, 2, 4};
        int sum = 0;
        int i = 0;
        for(; i < mass.length; i++){
            sum += mass[i];
        }
        System.out.println(sum);
        i = 0;
        sum = 0;
        while(i < mass.length){
            sum += mass[i];
            i++;
        }
        System.out.println(sum);
        i = 0;
        sum = 0;
        do{
            sum+=mass[i];
            i++;
        }while(i < mass.length);
        System.out.println(sum);
    }
    public void N_2(String[] args){
        for(int i = 0; i < args.length; i++) System.out.println(args[i]);

    }
    public void N_3(){
        double x = 0.0;
        for(int i = 1; i < 11; i++){
            x += 1.0 / i;
            System.out.println(x);
        }
    }
    public void N_4(){
        int[] mass = new int[10];
        int r, count = 0, swap;
        for(int i = 0; i < 10; i++){
            r = (int) (Math.random()*7);
            mass[i]= r;
            System.out.println(mass[i]);
        }
        System.out.println();
        while(count < 9){
            for(int i = 1; i < 10; i++){
                if(mass[i-1]>mass[i]){
                    swap = mass[i-1];
                    mass[i-1] = mass[i];
                    mass[i] = swap;
                }

            }
            count++;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(mass[i]);
        }
    }
    public void N_5(int x){
        int f = 1;
        while(x != 1){
            f*=x;
            x--;
        }
        System.out.println(f);
    }
}
