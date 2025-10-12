package com.multi.hw.HW_1001;

import java.util.Scanner;

public class ArrayCRUDMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayCRUD ac = new ArrayCRUD();

        while (true) {
            System.out.println("==== 숫자 관리 프로그램 ====");
            System.out.println("1. 추가");
            System.out.println("2. 조회(전체/번호)");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");

            int choice = sc.nextInt();
            if(choice == -1) {
                System.out.println("메뉴는 1~5 사이 숫자로 입력하세요.\n"); continue;
            }
            switch (choice) {
                case 1: //추가
                    System.out.println();
                    System.out.print("번호 입력: ");
                    int createno = sc.nextInt();
                    if(createno == -1){
                        System.out.println("→ 추가 실패(번호를 숫자로 입력)\n"); break;
                    }
                    System.out.print("값 입력: ");
                    int value = sc.nextInt();
                    if(value == -1){
                        System.out.println("→ 추가 실패(값을 숫자로 입력)\n"); break;
                    }
                    System.out.println(ac.create(createno, value) ?  "→ 데이터 추가 완료!\n" : "→ 추가 실패(번호 중복 또는 용량 초과)\n");
                    break;

                case 2: //조회
                    System.out.println();
                    System.out.println("[조회] 1. 전체  2. 번호");
                    System.out.print("선택: ");
                    int selectno = sc.nextInt();
                    if(selectno == 1){
                        System.out.println();
                        ac.read();
                        System.out.println();
                    } else if(selectno == 2){
                        System.out.println();
                        System.out.print("검색할 번호 입력: ");
                        int findno = sc.nextInt();
                        if(findno == -1){
                            System.out.println("→ 조회 실패(번호를 숫자로 입력)\n"); break;
                        }
                        Integer findvalue = ac.readByNo(findno);
                        if(findvalue == null) {
                            System.out.println("→ 결과 없음(해당 번호가 없습니다)\n");
                        } else {
                            System.out.printf("번호: %d, 값: %d%n%n", findno, findvalue);
                        }
                    } else {
                        System.out.println("→ 잘못된 선택입니다.\n");
                    }
                    break;

                case 3: //수정
                    System.out.println();
                    System.out.print("수정할 번호 입력: ");
                    int updateno = sc.nextInt();
                    if(updateno == -1){
                        System.out.println("→ 수정 실패(번호를 숫자로 입력)\n"); break;
                    }
                    System.out.print("새 값 입력: ");
                    int newvalue = sc.nextInt();
                    if(newvalue == -1){
                        System.out.println("→ 수정 실패(새 값을 숫자로 입력)\n"); break;
                    }
                    System.out.println(ac.update(updateno,newvalue) ?  "→ 수정 완료!\n" : "→ 수정 실패(해당 번호 없음)\n");
                    break;

                case 4: //삭제
                    System.out.println();
                    System.out.print("삭제할 번호 입력: ");
                    int deleteno = sc.nextInt();
                    if(deleteno == -1){
                        System.out.println("→ 삭제 실패(번호를 숫자로 입력)\n"); break;
                    }
                    System.out.println(ac.delete(deleteno) ? "→ 삭제 완료!\n" : "→ 삭제 실패(해당 번호 없음)\n");
                    break;

                case 5:
                    System.out.println("\n프로그램을 종료합니다");
                    return;

                default:
                    System.out.println("메뉴는 1~5 사이 숫자로 입력하세요.\n");
            }
        }
    }
}
