package com.multi.hw.HW_1001;

public class ArrayCRUD {
    private final int[][] data = new int[5][2];
    private int size = 0;

    //추가
    public boolean create(int no, int value){
        if(size >= 5) return false; //공간 없음
        if(findByNo(no) != -1) return false; //번호 중복 시 false
        data[size][0] = no;
        data[size][1] = value;
        size++;
        return true;
    }

    //전체 조회
    public void read(){
        System.out.println("[전체 데이터]");
        if(size == 0){
            System.out.println("(비어있음)");
            return;
        }
        for(int i = 0; i < size; i++){
            System.out.printf("번호: %d, 값: %d%n", data[i][0], data[i][1]);
        }
    }

    //번호 찾기
    private int findByNo(int no) {
        for (int i = 0; i < size; i++) {
            if (data[i][0] == no) return i;
        }
        return -1;
    }

    // 번호로 조회
    public Integer readByNo(int no) {
        int index = findByNo(no);
        return (index == -1) ? null : data[index][1];
    }

    //수정
    public boolean update(int no, int newValue){
        int index = findByNo(no);
        if(index == -1) return false;
        data[index][1] = newValue;
        return true;
    }

    //삭제
    public boolean delete(int no){
        int index = findByNo(no);
        if(index == -1) return false;
        for(int i=index+1; i < size; i++){
            data[i-1][0] = data[i][0];
            data[i-1][1] = data[i][1];
        }
        data[size-1][0] = 0;
        data[size-1][1] = 0;
        size--;
        return true;
    }


}
