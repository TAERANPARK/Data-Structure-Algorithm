package com.multi.basic.bfstree;


import java.util.LinkedList;
import java.util.Queue;

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}//NodeClass End

public class BfsBinaryTree {

    Node root;

    void bfs(Node node){
        if(node==null)return;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(node); //루트시작
        while (!queue.isEmpty()){ //queue가 비어있지 않으면 while문 돌아라
            Node current=queue.poll(); //queue에 있는 데이터 꺼내기
            System.out.print(current.value+" "); //1
            if(current.left!=null) queue.add(current.left);
            if (current.right !=null) queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        BfsBinaryTree tree=new BfsBinaryTree(); //tree 생성
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        //bfs탐색
        System.out.println("=== BFS Search ===");
        tree.bfs(tree.root);
    }

}
