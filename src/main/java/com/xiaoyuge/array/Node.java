package com.xiaoyuge.array;

public class Node {
    private Object obj;
    Node prev;
    Node next;

    public Node(){}

    public Node(Object obj, Node prev, Node next) {
        this.obj = obj;
        this.prev = prev;
        this.next = next;
    }

    public void setObj(Object obj){
        this.obj = obj;
    }
}
