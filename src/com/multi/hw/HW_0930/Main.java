package com.multi.hw.HW_0930;

import java.util.Scanner;

//자료구조 CRUD 콘솔 프로그램 - Main
// - 콘솔 메뉴 출력 및 Scanner로 사용자 입력 처리
// - 각 자료구조(스택/큐/단일 연결 리스트/이중 연결 리스트)의 메서드를 호출
// - 자료구조 메서드는 값/boolean만 반환하고, 메시지 출력은 Main이 담당
// - 메뉴 루프 → 서브 메뉴 → CRUD 동작 후 현재 상태 출력 → 이전/종료 선택

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    // ====== 자료구조 인스턴스 ======
    private static final MyStack stack = new MyStack();
    private static final MyQueue queue = new MyQueue();
    private static final MyLinkedList sll = new MyLinkedList();
    private static final MyDoubleLinkedList dll = new MyDoubleLinkedList();

    public static void main(String[] args) {
        while(true){
            System.out.println("\n=========================");
            System.out.println(" 자료구조 CRUD 프로그램");
            System.out.println("=========================");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. LinkedList");
            System.out.println("4. DoubleLinkedList");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택 >> ");
            int choice = sc.nextInt();

            switch (choice){
                case 1: StackMenu();
                break;
                case 2: QueueMenu();
                break;
                case 3: LinkedListMenu();
                break;
                case 4: DoubleLinkedListMenu();
                break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
    private static void StackMenu(){
        while(true){
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. 추가 (push)");
            System.out.println("2. 삭제 (pop)");
            System.out.println("3. 검색");
            System.out.println("4. 수정");
            System.out.println("0. 이전으로 돌아가기");
            System.out.print("선택 >> ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("추가할 값: ");
                    int data1 = sc.nextInt();
                    stack.push(data1);
                    System.out.println("추가되었습니다");
                    System.out.println("현재 Stack: "+stack);
                    break;
                case 2:
                    Integer popped = stack.pop();
                    if(popped == null){
                        System.out.println("Stack이 비어있습니다.");
                    }else {
                        System.out.println("삭제되었습니다.");
                        System.out.println("현재 Stack: "+stack);
                    } break;
                case 3:
                    System.out.print("검색할 값: ");
                    int data2 = sc.nextInt();
                    boolean found =stack.contains(data2);
                    System.out.println(found ? "검색값 "+data2+"이 존재합니다.":"검색값 "+data2+"이 존재하지 않습니다.");
                    break;
                case 4:
                    System.out.print("변경할 대상 값: ");
                    int origin = sc.nextInt();
                    System.out.print("새 값: ");
                    int change = sc.nextInt();
                    boolean update = stack.update(origin, change);
                    System.out.println(update? "수정되었습니다.":"대상 값을 찾지 못했습니다.");
                    System.out.println("현재 Stack: "+stack);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }

        }
    }
    private static void QueueMenu(){
        while(true){
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. 추가 (enqueue)");
            System.out.println("2. 삭제 (dequeue)");
            System.out.println("3. 검색");
            System.out.println("4. 수정");
            System.out.println("0. 이전으로 돌아가기");
            System.out.print("선택 >> ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("추가할 값: ");
                    int data1 = sc.nextInt();
                    queue.enQueue(data1);
                    System.out.println("추가되었습니다.");
                    System.out.println("현재 Queue: "+queue);
                    break;
                case 2:
                    Integer deleted = queue.deQueue();
                    if(deleted == null){
                        System.out.println("Queue가 비어있습니다.");
                    }else {
                        System.out.println("삭제되었습니다.");
                        System.out.println("현재 Queue: "+queue);
                    } break;
                case 3:
                    System.out.print("검색할 값: ");
                    int data2 = sc.nextInt();
                    boolean found = queue.contains(data2);
                    System.out.println(found ? "검색값 "+data2+"이 존재합니다.":"검색값 "+data2+"이 존재하지 않습니다.");
                    break;
                case 4:
                    System.out.print("변경할 대상 값: ");
                    int origin = sc.nextInt();
                    System.out.print("새 값: ");
                    int change = sc.nextInt();
                    boolean update = queue.update(origin, change);
                    System.out.println(update ? "수정되었습니다.":"대상 값을 찾지 못했습니다." );
                    System.out.println("현재 Queue: "+queue);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }

        }
    }
    public static void LinkedListMenu(){
        while(true){
            System.out.println("\n--- LinkedList Menu ---");
            System.out.println("1. 맨 앞 삽입");
            System.out.println("2. 맨 뒤 삽입");
            System.out.println("3. 특정 위치 삽입");
            System.out.println("4. 삭제");
            System.out.println("5. 검색");
            System.out.println("6. 수정");
            System.out.println("0. 이전으로 돌아가기");
            System.out.print("선택 >> ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("맨 앞에 추가할 값: ");
                    int data1 = sc.nextInt();
                    sll.addFirst(data1);
                    System.out.println("추가되었습니다.");
                    System.out.println("현재 LinkedList: " + sll);
                    break;
                case 2:
                    System.out.print("맨 뒤에 추가할 값: ");
                    int data2 = sc.nextInt();
                    sll.addLast(data2);
                    System.out.println("추가되었습니다.");
                    System.out.println("현재 LinkedList: " + sll);
                    break;

                case 3:
                    System.out.print("추가할 위치: ");
                    int index = sc.nextInt();
                    System.out.print("추가할 값: ");
                    int data3 = sc.nextInt();
                    boolean addAt = sll.addAt(index,data3);
                    System.out.println(addAt ? "추가되었습니다." : "인덱스 범위를 벗어났습니다.");
                    System.out.println("현재 LinkedList: " + sll);
                    break;
                case 4:
                    System.out.print("삭제할 값: ");
                    int data4 = sc.nextInt();
                    boolean delete = sll.delete(data4);
                    System.out.println(delete?"삭제되었습니다." : "대상 값을 찾지 못했습니다.");
                    System.out.println("현재 LinkedList: " + sll);
                    break;
                case 5:
                    System.out.print("검색할 값: ");
                    int data5 = sc.nextInt();
                    boolean found = sll.contains(data5);
                    System.out.println(found ? "검색값 "+data5+"이 존재합니다.":"검색값 "+data5+"이 존재하지 않습니다.");
                    break;
                case 6:
                    System.out.print("변경할 대상 값: ");
                    int origin = sc.nextInt();
                    System.out.print("새 값: ");
                    int change = sc.nextInt();
                    boolean updated = sll.update(origin, change);
                    System.out.println(updated ? "수정되었습니다." : "대상 값을 찾지 못했습니다.");
                    System.out.println("현재 LinkedList: " + sll);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        }

    }

    public static void DoubleLinkedListMenu() {
        while (true) {
            System.out.println("\n--- DoubleLinkedList Menu ---");
            System.out.println("1. 맨 앞 삽입");
            System.out.println("2. 맨 뒤 삽입");
            System.out.println("3. 특정 위치 삽입");
            System.out.println("4. 삭제");
            System.out.println("5. 검색");
            System.out.println("6. 수정");
            System.out.println("0. 이전으로 돌아가기");
            System.out.print("선택 >> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("맨 앞에 추가할 값: ");
                    int data1 = sc.nextInt();
                    dll.addFirst(data1);
                    System.out.println("추가되었습니다.");
                    System.out.println("현재 DoubleLinkedList: " + dll);
                    break;
                case 2:
                    System.out.print("맨 뒤에 추가할 값: ");
                    int data2 = sc.nextInt();
                    dll.addLast(data2);
                    System.out.println("추가되었습니다.");
                    System.out.println("현재 DoubleLinkedList: " + dll);
                    break;
                case 3:
                    System.out.print("추가할 위치: ");
                    int index = sc.nextInt();
                    System.out.print("추가할 값: ");
                    int data3 = sc.nextInt();
                    boolean addMiddle = dll.addMiddle(index, data3);
                    System.out.println(addMiddle ? "추가되었습니다." : "인덱스 범위를 벗어났습니다.");
                    System.out.println("현재 DoubleLinkedList: " + dll);
                    break;
                case 4:
                    System.out.print("삭제할 값: ");
                    int data4 = sc.nextInt();
                    boolean delete = dll.delete(data4);
                    System.out.println(delete ? "삭제되었습니다." : "대상 값을 찾지 못했습니다.");
                    System.out.println("현재 DoubleLinkedList: " + dll);
                    break;
                case 5:
                    System.out.println("검색할 값: ");
                    int data5 = sc.nextInt();
                    boolean found = dll.contains(data5);
                    System.out.println(found ? "검색값 "+data5+"이 존재합니다." : "검색값 "+data5+"이 존재하지 않습니다.");
                    break;
                case 6:
                    System.out.print("변경할 대상 값: ");
                    int origin = sc.nextInt();
                    System.out.print("새 값: ");
                    int change = sc.nextInt();
                    boolean updated = dll.update(origin, change);
                    System.out.println(updated ? "수정되었습니다." : "대상 값을 찾지 못했습니다.");
                    System.out.println("현재 DoubleLinkedList: " + dll);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }
}
