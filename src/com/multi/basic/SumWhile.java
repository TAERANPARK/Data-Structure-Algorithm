package com.multi.basic;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<n){
            sum += i;
            i++;
        }
        System.out.println("1부터 "+n+"까지의 합 : "+sum);
    }
}
