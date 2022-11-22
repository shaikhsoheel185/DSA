package com.DataStructure;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while (node!=null){
            System.out.print(node.val+" --> ");
            last=node;
            node=node.next;
        }
        System.out.println(" -- End ");
        /*System.out.println();
        System.out.println("Print in reverse ");
        while (last!=null){
            System.out.print(last.val+" --> ");
            last=last.prev;
        }
        System.out.println(" -- Start ");*/
    }

    class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.val = value;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
