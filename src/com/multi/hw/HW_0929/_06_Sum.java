package com.multi.hw.HW_0929;

import java.util.Scanner;
import java.util.Stack;

public class _06_Sum {
    public static void main(String[] args) {
        System.out.println("=== 자리수 합 구하기 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("모든 자릿수를 더할 정수를 입력하세요: ");
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        while(n != 0){
            int digit = n%10;
            stack.push(digit);
            sum += digit;
            n = n/10;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
            if(!stack.isEmpty()){
                System.out.print(" + ");
            }
        }
        System.out.println(" = "+sum);
    }
}
