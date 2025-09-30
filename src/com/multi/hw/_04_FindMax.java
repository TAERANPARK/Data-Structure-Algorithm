package com.multi.hw;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _04_FindMax {
    public static void main(String[] args) {
        System.out.println("=== 상위 2개 최대값 찾기 ===");
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.print("정수 5개를 입력하세요: ");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        int max1=arr[0];
        int max2=arr[0];
        for(int i=0;i<5;i++){
            if(arr[i]>max1){
                max2 = max1; //arr[i]가 max1보다 크면 기존 촤댓값은 max2로
                max1 = arr[i]; //arr[i]는 새로운 촤댓값
            }else if(arr[i] > max2 && arr[i] < max1){ //arr[i]가 max2보다 크고 max1보다 작을 때
                max2 = arr[i]; //arr[i]는 두번째 촤댓값
            }
        }

        System.out.println("첫번째 최댓값: "+max1);
        System.out.println("두번째 촤댓값: "+max2);
    }
}
