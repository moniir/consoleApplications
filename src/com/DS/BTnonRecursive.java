package com.DS;

public class BTnonRecursive {

    Node root;
    public void insert(int value){
        Node temp = new Node(value);
        if(root==null){
            root = temp;
            return;
        }
        Node currentNode= root;
        while(true){
            if(value<currentNode.data){
                if(currentNode.left==null){
                    currentNode.left=temp;
                    return;
                }
                currentNode=currentNode.left;
            } else {
                if(value> currentNode.data){
                    if(currentNode.right==null){
                        currentNode.right = temp;
                        return;
                    }
                    currentNode= currentNode.right;
                }
            }

        }
    }
    public static void main(String[] args){
        BTnonRecursive bt = new BTnonRecursive();
        bt.insert(6);
        bt.insert(4);
        bt.insert(3);
        bt.insert(5);
        bt.insert(8);
        bt.insert(7);
        bt.insert(19);
    }
}
