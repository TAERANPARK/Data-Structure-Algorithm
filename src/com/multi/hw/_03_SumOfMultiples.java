package com.multi.hw;

import java.util.Scanner;

public class _03_SumOfMultiples {
    public static void main(String[] args) {
        System.out.println("=== 특정 조건의 합 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("N값을 입력하세요: ");
        int n=sc.nextInt();

        int sum=0;

        //3의 배수 출력
        System.out.print("3의 배수: ");
        for(int i=3;i<n;i+=3){
            System.out.print(i+" ");
        }
        System.out.println();

        //5의 배수 출력
        System.out.print("5의 배수: ");
        for(int i=5;i<n;i+=5){
            System.out.print(i+" ");
        }
        System.out.println();

        //합 계산
        for(int i=1;i<n;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        System.out.println("1부터"+n+"까지의 3또는 5의 배수의 합: "+sum);
    }
}
