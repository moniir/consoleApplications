package com.linkedList.revLinkedListItr;

import com.linkedList.Node;

public class MyTest {

    private Node head;
    private Node tail;

    public Node insertBegNode(int data) {
        Node node = new Node(data,null);
            node.setLink(head);
            head= node;
        return head;
    }
    public Node insertAtEnd(int data) {
        Node temp = new Node(data, null);
        if ( head == null ) {
            head = temp;         // temp is the first elem.
            temp.setLink(null);    // Mark temp as the last Node.
        } else {
            Node ptr;
            ptr = head;
            while ( ptr.getLink() != null )   // Stop when you found: ptr.next == null
                ptr = ptr.getLink();           // Go to next node if ptr.next != null
            ptr.setLink(temp);     // Make the last node point to temp
            temp.setLink(null);   // Mark temp as the last Node
        }
        return head;
    }

    public Node reverse(Node node){
        Node prev = null,current, next = null;
        current = node;

        while(current.getLink()!=null) {
            next = current.getLink();
            current.setLink(prev);
            prev = next;
        }
        node = prev;
        return node;
    }

    public static void main(String []args) {
        MyTest myTest =new MyTest();
        Node temp =null;
        for(int i =10; i<15;i++){
//            temp = myTest.insertBegNode(i);
            temp = myTest.insertAtEnd(i);
        }
        Node linkRev = myTest.reverse(temp);
        while (temp.getLink()!=null) {
                if(temp.getLink()==null)
                    break;

                    System.out.print(temp.getData());
                    temp =temp.getLink();
            System.out.print("->");
        }
 /*       while (linkRev.getLink()!=null) {
            if(linkRev.getLink()==null)
                break;

            System.out.print(linkRev.getData());
            linkRev =linkRev.getLink();
            System.out.print(">>");
        }*/
    }
}
