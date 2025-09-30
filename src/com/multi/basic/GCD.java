package com.multi.basic;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("First Number");
        int a = in.nextInt(); //12
        System.out.println("Second Number");
        int b = in.nextInt();//18

        while (b!=0){
            int temp=b; //temp=b=18
            b=a%b;      //b=a%b 12%18=>12
            a=temp;     //a=temp a=18
        }
        System.out.println("최대공약수: "+a);
    }
}
//1회전
//int temp=b; //temp=b=18
//b=a%b;      //b=a%b 12%18=>12
//a=temp;     //a=temp a=18

//2회전
//int temp=b; //temp=b=12
//b=a%b;      //b=a%b 18%12=>6
//a=temp;     //a=temp a=12

//3회전
//int temp=b; //temp=b=6
//b=a%b;      //b=a%b 12%6=>0
//a=temp;     //a=temp a=6
