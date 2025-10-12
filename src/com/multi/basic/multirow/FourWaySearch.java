package com.multi.basic.multirow;

import java.util.Arrays;

public class FourWaySearch {
    public static void main(String[] args) {
        //1. 델타 배열을 먼저 정의 (상 하 좌 우)
        int[][]deltas= {
                {-1,0}, // 행이 위로 이동, 좌우 변화 없음
                {1,0}, // 행이 아래로 이동, 좌우 변화 없음
                {0,-1}, // 상하 변화 없음, 열이 왼쪽으로 이동
                {0,1} // 상하 변화 없음, 열이 오른쪽으로 이동
        };
        //2. 4x4 문자형 이차원 배열 grid 정의
        char[][] grid = {
                { '2', '3', '1', '4' },
                { '1', 'X', '3', '2' },
                { '3', '4', 'X', 'X' },
                { 'X', '4', '1', '5' }
        };
        int sum=0;
        for(char[] c:grid){
            System.out.println(Arrays.toString(c));
        }//4*4행 원본 배열 출력

        //4행 4열을 순회 -> X를 찾고 -> X의 사방의 숫자를 더하고 -> X를 0으로 치환
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                if(grid[r][c]=='X'){//x를 1행1열 기준으로
                    //X를 찾았으면 X를 기준으로 변화량을 체크한다
                    for (int d = 0; d < deltas.length; d++) {//deltas배열의 행 길이만큼 포문이 돈다
                        int nr=r+deltas[d][0];//nr=0
                        int nc=c+deltas[d][1];//nc=1
                        if(nr>=0 && nr<grid.length && nc>=0 && nc<grid.length && grid[nr][nc]!='X'){
                            sum+=grid[nr][nc]-'0';
                            grid[nr][nc]='0';
                        }//if
                    }//deltas for
                }//if
            }//for
        }//for

        System.out.println("---------------------------------------------");
        for(char c[]:grid) {
            System.out.println(Arrays.toString(c));
        }
        // 최종 합계를 출력
        System.out.println(sum); // 합계 출력
    }
}
