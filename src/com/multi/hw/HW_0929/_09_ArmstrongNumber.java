package com.multi.hw.HW_0929;

import java.util.Scanner;

public class _09_ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("=== 암스트롱 수 판별 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("암스트롱 수인지 판별 할 세자리 정수를 입력하세요: ");
        int num = sc.nextInt();
        int original = num;

        int digits = 0;
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = num;
        while(temp!=0){
            int digit = temp%10;
            temp = temp/10;

            int result = 1;
            for(int i=1;i<=digits;i++){ // 자릿수만큼 곱하기
                result*=digit;
            }
            sum+=result;
        }
        System.out.println("계산된 합: "+sum);

        if(sum==original){
            System.out.println(original+" -> 암스트롱 수입니다.");
        }else {
            System.out.println(original+" -> 암스트롱 수가 아닙니다.");
        }
    }
}
