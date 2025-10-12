package com.multi.hw.HW_1001;

public class RowColChange {
    public void init(int[][]data){ //배열 초기화 메서드
        int count = 0;
        for(int i=0;i<data.length;i++){ //배열의 각 행에 대해 반복 row가 4일 때 i<4까지 반복
            for(int j=0;j<data[i].length;j++){ //배열의 각 열에 대해 반복
                data[i][j]=++count; //전위 ++이기 떄문에 1부터 들어감
            }
        }
    }
//    i=0, j=0 → ++count = 1 → data[0][0]=1
//    i=0, j=1 → ++count = 2 → data[0][1]=2
//    i=0, j=2 → ++count = 3 → data[0][2]=3
//    i=1, j=0 → ++count = 4 → data[1][0]=4
//    i=1, j=1 → ++count = 5 → data[1][1]=5
//    i=1, j=2 → ++count = 6 → data[1][2]=6

    public void print(int[][]data){ //배열 출력 메서드
        for(int i=0;i<data.length;i++){ //각 행에 대해 반복
            for(int j=0;j<data[i].length;j++){ //각 열에 대해 반복
                System.out.printf("%5d",data[i][j]); //각 요소 오른쪽 정렬
            }
            System.out.println(); //각 열 끝나면 줄바꿈
        }
        System.out.println(); //배열 끝나면 줄바꿈
    }

    public void change(int[][]aa, int[][]bb){
        int aarow=0,aacol=0; //aa의 현재 (행, 열) 포인터
        for(int i=0; i<bb.length;i++){ //bb의 각 행
            for(int j=0;j<bb[i].length;j++){ //bb의 각 열
                bb[i][j]=aa[aarow][aacol]; //aa에서 읽어 bb에 복사
                if(aacol<aa[0].length-1){ //아직 같은 행의 다음 열이 있으면
                    aacol++; // 열만 +1
                }else { //같은 행의 마지막 열이면
                    aacol=0; //열은 0으로 초기화
                    aarow++; //행을 +1 -> 다음 행으로 이동
                }
            }
        }
    }
//    i=0,j=0 ← aa(0,0)=1
//    i=0,j=1 ← aa(0,1)=2
//    i=0,j=2 ← aa(0,2)=3
//    i=0,j=3 ← aa(1,0)=4   // aacol 끝→열=0,행+1
//    i=1,j=0 ← aa(1,1)=5
//    i=1,j=1 ← aa(1,2)=6
//    i=1,j=2 ← aa(2,0)=7
//    i=1,j=3 ← aa(2,1)=8

    public static void main(String[] args) {
        RowColChange rowColChange=new RowColChange();
        final int ROW=4;
        final int COL=3;
        int [][]aa=new int[ROW][COL];//4행 3열
        int [][]bb=new int[COL][ROW];//3행 4열
        rowColChange.init(aa);
        rowColChange.print(aa);
        rowColChange.change(aa, bb);
        rowColChange.print(bb);

    }

}
