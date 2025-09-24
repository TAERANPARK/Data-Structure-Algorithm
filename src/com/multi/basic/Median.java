package com.multi.basic;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;   // a ≥ b ≥ c → b가 중앙값
            } else if (a <= c) {
                return a;   // b < c, a ≤ c → a가 중앙값
            } else {
                return c;   // b < c, a > c → c가 중앙값
            }
        } else if (a > c) {
                return a;   // c < a < b → a가 중앙값
            } else if (b > c) {
                return c;   // a ≤ c < b → c가 중앙값
            } else {
                return b;   // a ≤ b ≤ c → b가 중앙값
            }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a 값 : ");
        int a = sc.nextInt();
        System.out.println("b 값 : ");
        int b = sc.nextInt();
        System.out.println("c 값 : ");
        int c = sc.nextInt();
        System.out.println("세 정수의 중앙값은 " + med3(a,b,c)+"입니다.");
    }
}
