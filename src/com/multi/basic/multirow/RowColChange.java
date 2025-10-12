package com.multi.basic.multirow;

public class RowColChange {

    // 이차원 배열을 초기화하는 메서드
    public void init(int [][]data){
        int cnt = 0; // 초기화에 사용할 카운터 변수
        // 배열의 각 행에 대해 반복
        for (int i = 0; i < data.length; i++) {
            // 현재 행의 각 열에 대해 반복
            for (int j = 0; j < data[i].length; j++) {//열의 갯수
                // 배열에 카운터 값을 증가시키며 할당
                data[i][j] = ++cnt;
            }
        }
    }

    // 이차원 배열을 출력하는 메서드
    public void disp(int [][]data){
        // 배열의 각 행에 대해 반복
        for (int i = 0; i < data.length; i++) {
            // 현재 행의 각 열에 대해 반복
            for (int j = 0; j < data[i].length; j++) {
                // 각 요소를 5칸을 사용하여 오른쪽 정렬 형태로 출력
                System.out.printf("%5d", data[i][j]);
            }
            System.out.println();
        }
        // 배열 출력이 끝나면 줄바꿈 추가
        System.out.println();
    }

    //aa 4행 3열을 bb 3행 4열에 넣음
    public void change(int[][] aa, int[][] bb) {
        int h=0,y=0; //행h 열y 초기화
        for (int i = 0; i < bb.length; i++) {//행
            for (int j = 0; j < bb[i].length; j++) {//열
                //bb[i][j]=aa[i][j]; java.lang.ArrayIndexOutOfBoundsException
                bb[i][j]=aa[h][y];
                //열의 끝인가 ? 열을 초기화화고 행을 증가?행을증가:행을증가하지 않느다 : 열을 증가
                if(y<aa[i].length-1) {//열의 끝이 아니면...
                    y++;
                }else {//열의 끝이면...
                    y=0;
                    h++;
                }

            }
        }
    }

    public static void main(String[] args) {
        final int ROW=4;
        final int COL=3;
        int [][]aa=new int[ROW][COL]; //4행 3열
        int [][]bb=new int[COL][ROW]; //3행 4열
        RowColChange rowColChange=new RowColChange();
        rowColChange.init(aa);
        rowColChange.disp(aa);
        rowColChange.change(aa,bb);
        rowColChange.disp(bb);

    }
}
