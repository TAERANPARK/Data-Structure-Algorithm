package com.multi.hw;

import java.util.Scanner;

public class _02_ReverseSum {
    public static int reverseNumber(int n){
        int reversed=0;
        while(n!=0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("=== 숫자 뒤집고 합 계산 ===");
        Scanner sc=new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요: ");
        int num1=sc.nextInt();
        System.out.print("두번째 정수를 입력하세요: ");
        int num2=sc.nextInt();

        int reversed1=reverseNumber(num1);
        int reversed2=reverseNumber(num2);

        System.out.println("reversed num1: "+reversed1);
        System.out.println("reversed num2: "+reversed2);
        System.out.println("뒤집은 두 숫자의 합: "+(reversed1+reversed2));
    }
}
