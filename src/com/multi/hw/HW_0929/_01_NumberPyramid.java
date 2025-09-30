package com.multi.hw.HW_0929;

import java.util.Scanner;

public class _01_NumberPyramid {

    public static void main(String[] args) {
        System.out.println("=== 숫자 피라미드 ===");
        System.out.print("층 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { //행 관련
            for (int j = 1; j <= n-i; j++) { //열 관련
                System.out.print(" "); //공백 출력
            }
            for (int k=1;k<=i;k++){ //완쪽 오름차순
                System.out.print(k);
            }
            for (int k=i-1; k>=1;k--){ //오른쪽 내람차순
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
