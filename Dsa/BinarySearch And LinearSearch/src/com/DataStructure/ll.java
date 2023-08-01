package com.DataStructure;

public class ll {
    private Node head;
    private Node tail;
    private int size;

    public void Insert(int index, int val) {

        if (index==0){
            InsertFirst(val);
            return;
        }

        if (index==size){
            InsertLast(val);
            return;
        }

        Node temp=head;

        for (int i=1; i<index; i++){
             temp=temp.next;
        }

        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;


    }
    public void InsertFirst(int val){

        Node node=new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size=+1;

    }

    public void InsertLast(int val){

        if (tail==null){
            InsertFirst(val);
            return;
        }

        Node node=new Node(val);
        tail.next=node;
        tail=node;

        size++;

    }

    public void Delete(int index){
        if (index==0){
            DeleteFirst();
            return;
        }
        if (index==size){
            DeleteLast();
            return;
        }

        Node Temo =head;
        for (int i=0; i<index; i++){
             Temo=Temo.next;
        }


    }

    public int DeleteFirst(){
        int value;
        if (head==null){
            tail=null;
        }
        value=head.val;
        head.next=head;
        size--;
        return value;
    }

    public void DeleteLast(){

        if (size<=1){
            DeleteFirst();
            return;
        }

        Node temp;
        temp=Get(size-2);

        tail=temp;
        tail.next=null;

        size--;
    }

    public Node Get(int index){

        Node node=head;

        for (int i=0; i<index; i++){
            node=node.next;
        }
        return node;
    }
    public void Display(){

        Node temp=head;
        while (temp!=null){

            System.out.print(temp.val + " -- > ");
            temp=temp.next;

        }
        System.out.println(" -- > End ");
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public ll() {
        this.size = 0;
    }
}
