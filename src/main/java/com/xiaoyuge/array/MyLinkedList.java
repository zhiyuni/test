package com.xiaoyuge.array;

public class MyLinkedList {
    private Node first;
    private Node last;
    int size = 0;
    public void add(Object obj){
        Node node = new Node();
        if (first == null){
            node.prev = null;
            node.next = null;
            node.setObj(obj);
            first = node;
            last= node;
        }else {
            node.prev = last;
            node.next = null;
            node.setObj(obj);
            last.next = node;
            last = node;
        }
    }
}
