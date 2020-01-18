package com.BST;

class BST {

     BNode root;

    public BST() {
        root = null;
    }

    public  void insert(int data) {
        root = insertData(root, data);

    }
    BNode insertData(BNode root, int data){
        if(root==null) {
            root = new BNode(data);
            return root;
        }
        if(root.getData()>data){
            root.setLeft(insertData(root.getLeft(),data));
        } else if(root.getData()<data){
            root.setRight(insertData(root.getRight(),data));
        }
        return root;

    }

    BNode updateData(BNode root,int data){

        BNode newNode = new BNode(data);

        BNode x = root;
        BNode y =null;

        while (x!=null){
            y = x;

        }
    return y;
    }

    public static void main(String[] args) {

        BST bst = new BST();
        int[] arr = {5,8,17,11,4,18,27};
            for(int d : arr)
                bst.insert(d);

            bst.inOrder();

    }
    void inOrder()  {
        inorderRec(root);
    }
    void inorderRec(BNode root){
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.printf(root.getData()+" ");
            inorderRec(root.getRight());
        }
    }
}

