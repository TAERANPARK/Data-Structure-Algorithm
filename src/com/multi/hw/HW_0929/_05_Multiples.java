package com.multi.hw.HW_0929;

import java.util.Scanner;

public class _05_Multiples {
    public static void main(String[] args) {
        System.out.println("=== 배수의 개수 세기 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("배수를 구할 숫자 범위를 입력하세요 (1 부터 N): ");
        int n = sc.nextInt();
        System.out.print("어떤 수의 배수를 구할 것인지 입력하세요: ");
        int k = sc.nextInt();

        int count = 0;
        for(int i=k;i<=n;i+=k){
            count++;
        }
        System.out.print(count+"개 (");

        for(int i=k;i<=n;i+=k){
            System.out.print(i);
            if(i+k<=n){
                System.out.print(", ");
            }else {
                System.out.print(")");
            }
        }
    }
}
