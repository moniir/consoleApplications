package com.linkedList;

public class LinkedInsertTest {

    private Node head;
    private int size;

    public void printList() {
        Node temp = head;
        System.out.print("List Is: ");
        while(head.getLink() != null) {

            System.out.print(temp.getData());
            if(temp.getLink()==null){
                break;
            }
            temp = temp.getLink();
            System.out.print("->");
        }
        System.out.println();
    }

    public LinkedInsertTest(){
        head = null;
        size =0;
    }

    public void insertAtBeginning(int data ){
        Node temp = new Node(data, null);
        temp.setLink(head);
         head = temp;
    }

    public static void main(String[] args) {
        LinkedInsertTest lit = new LinkedInsertTest();
        int arr[] = {10,12,14};
        for (int i : arr) {
            lit.insertAtBeginning(i);
            lit.printList();
        }
    }
}
