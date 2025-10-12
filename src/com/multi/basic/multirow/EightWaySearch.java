package com.multi.basic.multirow;

import java.util.Arrays;

public class EightWaySearch {
    public static void main(String[] args) {
        int[][] deltas = {
                { -1, 0 }, // 상: 행 -1, 열 변화 없음
                { 1, 0 }, // 하: 행 +1, 열 변화 없음
                { 0, -1 }, // 좌: 행 변화 없음, 열 -1
                { 0, 1 }, // 우: 행 변화 없음, 열 +1
                { -1, -1 }, // 좌상 대각선: 행 -1, 열 -1
                { -1, 1 }, // 우상 대각선: 행 -1, 열 +1
                { 1, -1 }, // 좌하 대각선: 행 +1, 열 -1
                { 1, 1 } // 우하 대각선: 행 +1, 열 +1
        };
        // 4x4 문자형 이차원 배열 grid 정의
        char[][] grid = { { '2', '3', '1', '4' },
                { '1', 'X', '3', '2' },
                { '3', '4', 'X', 'X' },
                { 'X', '4', '1', '5' } };

        int sum = 0; // 합계를 저장할 변수 sum 초기화
        System.out.println("---------------------------------------------");
        for(char c[]:grid) {
            System.out.println(Arrays.toString(c));
        }


    }
}
