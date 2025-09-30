package com.multi.hw.HW_0929;

import java.util.Scanner;

public class _08_Triangle {
    public static void main(String[] args) {
        System.out.println("=== 거꾸로 된 삼각형 출력 ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("삼각형의 단 수를 입력하세요: ");
        int n = sc.nextInt();

        for (int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
