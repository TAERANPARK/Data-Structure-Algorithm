package com.multi.basic.tree;

public class CompleteBinaryTree {
    int []tree;
    int size;
    public CompleteBinaryTree(int capacity){
        tree=new int[capacity]; //트리의 최대 크기 지정
        size=0; //초기 노드 수 0
    }

    public void insert(int value){
        if(size==tree.length){
            System.out.println("Tree is full");
            return;
        }
        tree[size++]=value;
    }

    //트리출력
    public void printTree(){
        System.out.print("현재 트리 상태 : ");
        for(int i=0;i<size;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }

    // 부모 노드 인덱스 가져오기  (부모 공식: (자식 인덱스 - 1) / 2)
    public int getParentIndex(int index){
        if(index==0) return -1;
        return (index-1)/2; //(자식인덱스-1)/2는 부모인덱스
    }

    // 왼쪽 자식 노드 인덱스 가져오기 (왼쪽 자식 공식: 2 * 부모 인덱스 + 1)
    public int getLeftChildIndex(int index) {
        int leftIndex = 2 * index + 1;
        if (leftIndex >= size) return -1; // 왼쪽 자식 없음
        return leftIndex;
    }

    // 오른쪽 자식 노드 인덱스 가져오기 (2 * 부모 인덱스 + 2)
    public int getRightChildIndex(int index) {
        int rightIndex = 2 * index + 2;
        if (rightIndex >= size) return -1; // 오른쪽 자식 없음
        return rightIndex;
    }

    public static void main(String[] args) {
        CompleteBinaryTree cbt = new CompleteBinaryTree(10);
        cbt.insert(10);
        cbt.insert(20);
        cbt.insert(30);
        cbt.insert(40);
        cbt.insert(50);
        cbt.printTree();
        int index=1; //현재 노드의 값은 20
        System.out.println("현재 노드: " + cbt.tree[index]);
        System.out.println("부모 노드: " + cbt.tree[cbt.getParentIndex(index)]);
        System.out.println("왼쪽 자식: " + cbt.tree[cbt.getLeftChildIndex(index)]);
        System.out.println("오른쪽 자식: " + cbt.tree[cbt.getRightChildIndex(index)]);
    }
}
