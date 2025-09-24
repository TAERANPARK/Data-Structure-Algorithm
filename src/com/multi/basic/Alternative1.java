package com.multi.basic;

import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("+와 -를 번갈아 출력합니다");


        //do-while문 - 무조건 한번 n값 입력 받고 n이 0보다 클 떄 까지 다시 입력받음
        do {
            System.out.println("n값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        //i값이 2로 나눴을 때 나머지가 0이면 +출력, 아니면 -출력
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                System.out.println("+");
            }else {
                System.out.println("-");
            }
        }
    }
}
