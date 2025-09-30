package com.multi.hw;

import java.util.Scanner;

public class _07_PerfectNumber {
    public static void main(String[] args) {
        System.out.println("=== 완벽한 숫자 판별 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("완전수인지 판별 할 숫자를 입력하세요: ");
        int n = sc.nextInt();

        int sum=0;
        System.out.print(n+"의 약수 : ");
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
                System.out.print(i+", ");
            }
        }
        System.out.println("-> 합 = "+sum);
        if(sum==n){
            System.out.println("완벽한 숫자 입니다.");
        }else {
            System.out.println("완벽한 숫자가 아닙니다.");
        }
    }
}
