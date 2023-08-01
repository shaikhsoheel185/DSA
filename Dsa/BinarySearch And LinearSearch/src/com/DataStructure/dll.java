package com.DataStructure;

public class dll {
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
    public void insertLast(int val){
        Node node=new Node(val);

    }

    public void show(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.val+" --> ");
            temp=temp.next;
        }
        System.out.println(" --> End ");
    }

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
