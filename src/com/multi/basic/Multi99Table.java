package com.multi.basic;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println("구구단 출력");

        for(int i=1;i<=9;i++){
            for(int j=2;j<=9;j++)
                //System.out.println(i+"*"+j+" = "+i*j); 이렇게 작성하면 2단부터 9단까지 세로 일렬로 나옴
                System.out.printf("%d*%d=%d\t",j,i ,i * j);
            // "%d*%d=%d\t" 각각 j, i, j*i가 들어가는 자리, \t는 탭간격
                System.out.println();
        }
    }
}
