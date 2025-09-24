package com.multi.basic;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println( "이 수는 양수입니다.");
        } else if (n < 0) {
            System.out.println("이 수는 음수입니다.");
        }  else {
            System.out.println("이 수는 0입니다.");
        }
    }
}
