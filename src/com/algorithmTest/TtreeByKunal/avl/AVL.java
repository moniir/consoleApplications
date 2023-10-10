package com.algorithmTest.TtreeByKunal.avl;

class AVL {

    class Node{
        int value;
        int height;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
        public int getValue(){
            return this.value;
        }
    }

    Node root;
    AVL(){}

    int height(){
       return height(root);
    }

    int height(Node node){
        if(node==null)
            return -1;
        return node.height;
    }
    void populate(){
        for(int i=0;i<10;i++){
            root = populate(i);
        }
    }
    Node populate(int value){
        return insert(value,root);
    }
    Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return rotate(node);
    }

    Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){ //left heavy
            if(height(node.left.left) - height(node.left.right) > 0) { //left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){ //left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.right) - height(node.left) > 1){ //right heavy
            if(height(node.right.right) - height(node.right.left) > 0){ // right right case
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right) > 1){  //right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    Node leftRotate(Node node){
        //incomplete
        return node;
    }
    Node rightRotate(Node node){

        //incomplete
        return node;
    }
}
