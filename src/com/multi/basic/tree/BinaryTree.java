package com.multi.basic.tree;

// new Node();를 호출하면 Heap 메모리에 Node 객체가 생성되고,
// 해당 객체는 int형 value와 Node 타입의 left, right 필드를 가진다.
class Node {
    int value;       // 실제 노드의 데이터 (예: 숫자)
    Node left;       // 왼쪽 자식 노드를 참조 (Node 타입 객체를 가리키는 참조 변수)
    Node right;      // 오른쪽 자식 노드를 참조

    public Node(int value) {
        this.value = value;
    }
}

public class BinaryTree {
    Node root=null; //아무것도 안쓰면 null이 들어감Node root=null
    //preOrder는 DFS의 전위순회방법 root->left->right
    public void preOrder(Node node){
        if(node==null) return;
        System.out.println(node.value+" ");
        preOrder(node.left); //재귀호출
        preOrder(node.right); //재귀호출
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); //Node root가 만들어짐
        tree.root = new Node(1); // value(1)|left|right
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Preorder(전위) traversal(순회) of the tree");
        tree.preOrder(tree.root); //1 2 4 5 3
    }
}
