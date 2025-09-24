package com.multi.basic;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;
        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.println("출력할 별의 갯수(n)을 입력하세요: ");
            n = sc.nextInt();
        } while (n <= 0); //n이 0보다 작으면 다시 입력받음

        do {
            System.out.println("줄바꿈 할 갯수(w)를 입력하세요: ");
            w = sc.nextInt();
        } while (w <= 0 || w > n); // w가 0보다 작거나 n보다 크면 다시 입력받음

        for (int i = 0; i < n; i++) { // i가 0부터 n보다 작을 때 까지 i++
            System.out.print("*");
            if (i % w == w-1) { // i를 w로 나눈 나머지가 w-1과 같으면 줄바꿈
                System.out.println();
            }
        }
    }
}
