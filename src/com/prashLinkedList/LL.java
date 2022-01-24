package com.prashLinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node= new Node(val);
        node.next= head;
        head= node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insert(int val, int pos){
        if(pos==0){
            insertFirst(val);
            return;
        }
        if(pos==size){
            insertLast(val);
            return;
        }
        try{
            Node temp= head;
            int count=pos;
            while(count>1){
                count--;
                temp=temp.next;
            }
            Node node= new Node(val);
            node.next= temp.next;
            temp.next= node;
            size+=1;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next= node;
        tail= node;
        size+=1;
    }

    public int deleteFirst(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return -1;
        }
        Node temp= head;
        head= head.next;
        temp.next=null;

        size--;
        return temp.value;
    }

    public int delete(int index){
        if(size==0){
            System.out.println("Linked List is Empty");
            return -1;
        }

        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        int val=-1;
        try {
            Node temp= get(index-1);
            val= temp.next.value;
            temp.next=temp.next.next;
            size--;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return val;
    }

    public int deleteLast(){
        if(size==0){
            System.out.println("Linked List is Empty");
            return -1;
        }
        if(size<=1){
            return deleteFirst();
        }
        Node temp= get(size-2);
        int val= tail.value;
        temp.next= null;
        tail= temp;
        size--;
        return val;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }
        return temp;
    }

    public void display(){
        if(size==0){
            return;
        }
        Node temp= head;
        while(temp.next!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println(temp.value);
    }

    private class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value= value;
        }

        private Node(int value, Node next){
            this.value= value;
            this.next= next;
        }

    }
}
