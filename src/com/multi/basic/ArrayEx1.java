package com.multi.basic;

import java.util.Scanner;

public class ArrayEx1 {
    //최대키,최소키,평균키,평균보다 높은키의 갯수 ,평균보다 낮은 키의 갯수
    public static int getMaxHeight(int []height) {
        int max = height[0];
        for(int h:height){
            if(h>max){
                max=h;
            }
        }
        return max;
    }
    public static int getMinHeight(int []height) {
        int min = height[0];
        for(int h:height){
            if(h<min){
                min=h;
            }
        }
        return min;
    }
    public static double getAvgHeight(int []height) {
        double sum=0;
        for(int h:height){
            sum+=h;
        }
        return sum/height.length;
    }
    //평균 키보다 높은 키의 갯수
    //평균 키보다 낮은 키의 갯수
    public static int getCountAvoveAverage(int state, int [] height) {
        int count=0;
        double avg = getAvgHeight(height);
        for(int h:height){
            if(state==1&&h>avg){
                count++;
            }
            else if(state==2&&h<avg){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []height={150,180,190,188,178,182,179,199};
        System.out.println("최댓값: "+getMaxHeight(height));
        System.out.println("최솟값: "+getMinHeight(height));
        System.out.println("평균키: "+getAvgHeight(height));
        System.out.println("평균보다 키가 큰 인원: "+getCountAvoveAverage(1,height)+"명");
        System.out.println("평균보다 키가 작은 인원: "+getCountAvoveAverage(2,height)+"명");
    }

}
