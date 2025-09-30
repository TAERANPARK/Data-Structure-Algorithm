package com.multi.hw;

import java.util.Scanner;

public class _10_SumOfGeometricProgression {
    public static void main(String[] args) {
        System.out.println("=== 등비수열의 합 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 항을 입력하세요: ");
        int A = sc.nextInt();
        System.out.print("공비를 입력하세요: ");
        int R = sc.nextInt();
        System.out.print("항의 갯수를 입력하세요: ");
        int N = sc.nextInt();

        int sum=0;
        for (int i = 1; i <= N; i++) {
            System.out.print(A);// 현재 항 출력
            sum += A; //sum에 더함
            if(i<N){
                System.out.print(" + ");
            }
            A *= R; // 다음 항 준비
        }
        System.out.print(" = "+sum);
    }
}
