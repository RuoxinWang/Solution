package com.company;

public class LinkedList{
    int size;
    ListNode list;
    private static Object obj = new Object();

    public LinkedList() {
        this.size = 0;
        list = new ListNode(0);
    }

    public void addAtPosition(int index, int element){
        synchronized (obj) {
            if(index > size) return;
            if(index < 0) index = 0;
            size++;
            ListNode pre = list;
            while(index-- > 0) {
                pre = pre.next;
            }

            ListNode newNode = new ListNode(element);
            newNode.next = pre.next;
            pre.next = newNode;
        }
    }

    public void removeAtPosition(int index, int element){
        synchronized (obj) {
            if(index < 0 || index >= size) return;
            size--;
            ListNode pre = list;
            while(index-- > 0) pre = pre.next;
            pre.next = pre.next.next;
        }
    }

    public int getFirst() {
        synchronized (obj) {
            return list.next.val;
        }
    }

    public int getLast() {
        synchronized (obj) {
            ListNode last = list;
            for(int i = 0; i < size; i++) last = last.next;
            return last.val;
        }
    }

    public int size(){
        synchronized (obj) {
            return size;
        }
    }
}
