package com.multi.basic;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i == n - 1; i++) {
                if (n%i==0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime? "소수입니다":"소수아닙니다");
    }
}
