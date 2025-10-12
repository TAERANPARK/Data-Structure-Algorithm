package com.multi.basic.multirow;

public class MultiRowCrud {
    int [][]m=new int [2][3];//2행3열
    int row=0,col=-1;//현재위치의 row와 col을 초기화

    public void add(int data){ //꽉 차면 용량 늘린 뒤 값 추가한다
        if(isFull()){ //행이 끝이고 열이 끝이니?
            increment();//그럼 행은 2개 늘리고 열은 대로 두고 생성해 오리지넣 복사하고 imsi 배열을 m에 전달
        }
        if(col<m[0].length-1){ //열의 끝보다 작은가?
            col++;
        }else {//열이 가득차있다.
            col=0;
            row++;
        }
        m[row][col]=data; //실제 데이터 저징

    }
    public void increment(){//공간 모자르면 공간 늘려줌
        int [][]imsi=new int [m.length+2][m[0].length]; // 2핼 3열이 4행 3열 됨
        System.arraycopy(m,0,imsi,0,m.length);
        m=imsi;
    }

    //isFull row==m.length-1 && col==m[0].length-1
    public boolean isFull(){//2차원 배열이 다 차있는지 판별
        return row==m.length-1 && col==m[0].length-1;
    }

    //row가 0과 같고 col이 -1인 상태
    public boolean isEmpty(){
        return row==0 && col==-1;
    }

    public void disp(){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++) {
                if (m[i][j] == 0) {
                    continue;
                }// 0일때 찍지 말아라.. continue;
                System.out.print(m[i][j] + "\t");
            }//내부for문
            System.out.println();
        }//외부for문
        System.out.println();
    }

    //값에 대한 배열을 통해서 행과 열을 반환
    public int[] search(int data){
        for (int i=0;i<m.length;i++) {
            for (int j=0;j<m[i].length;j++) {
                if (m[i][j] == data) {
                    return new int[]{i, j};
                }
            }
        }return null;
    }

    public void modify(int origin,int change){
        int []rs=search(origin);
        if(rs==null)return;
        m[rs[0]][rs[1]]=change;
    }

    public void delete(int data) {
        // 삭제할 데이터 위치 찾기
        int[] rs = search(data);
        if (rs == null) return;

        int r = rs[0]; // 행
        int c = rs[1]; // 열

        for (int i = r; i < m.length; i++) { // 행 반복
            for (int j = c; j < m[i].length; j++) { // 열 반복
                // 마지막 요소라면 그냥 0으로
                if (i == m.length - 1 && j == m[i].length - 1) {
                    m[i][j] = 0;
                    break;
                }

                // 현재 열이 마지막 열이라면 → 다음 행의 첫 번째 값 가져오기
                if (j == m[i].length - 1) {
                    m[i][j] = m[i + 1][0];
                } else {
                    m[i][j] = m[i][j + 1];
                }
            }//내부 for
            c = 0; // 다음 행에서는 열을 0부터 시작
        }//외부 for

        // row, col 조정
        if (col == 0) {
            row--;
            col = m[0].length - 1;
        } else {
            col--;
        }
    }

    public static void main(String[] args) {
        MultiRowCrud mr=new MultiRowCrud();
        mr.add(10); //row0, col0
        mr.add(20); //row0, col1
        mr.add(30); //row0, col2
        mr.add(40); //row1, col0
//        mr.add(50); //row1, col1
//        mr.add(60); //row1, col2
        mr.disp();
        mr.delete(40);
        mr.disp();
    }

}
