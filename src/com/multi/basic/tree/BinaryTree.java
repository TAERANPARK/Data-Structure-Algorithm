package com.multi.basic.tree;

import org.w3c.dom.ls.LSOutput;

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;
    //전위 순회 (Preorder)
    void preorder(Node node){
        if(node == null) return;
        System.out.println(node.value); //value를 확인하는 용도
        preorder(node.left); //재귀호출
        preorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        // 트리검색
        System.out.println("전위 순회");
        tree.preorder(tree.root);
    }
}
