package com.multi.basic;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void swap(int []a,int idx1,int idx2) {
        int imsi=a[idx1];
        a[idx1]=a[idx2];
        a[idx2]=imsi;
    }

    public static void reverse(int []a) {
        for (int i = 0; i < a.length/2; i++) {
            swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요소 수: ");
        int num = stdIn.nextInt(); //num이 실제 배열의 갯수가 됨
        int []x = new int[num]; //배열 생성
        for(int i=0;i<num;i++){
            System.out.println("x["+i+"]="+x[i]);
            x[i]=stdIn.nextInt();
        }
        System.out.println("Before"+ Arrays.toString(x)); //베열의 데이터를 문자열로 반환한다
        reverse(x);
        System.out.println("After"+ Arrays.toString(x)); //reverse후 데이터를 문자열로 반환단다
    }
}
