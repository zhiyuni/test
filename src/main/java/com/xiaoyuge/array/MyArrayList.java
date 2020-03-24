package com.xiaoyuge.array;

public class MyArrayList {
    private Object[] arrayList;
    private int size;

    public MyArrayList() {
        arrayList = new Object[10];
    }

    public void add(Object obj) {
        if (size >= arrayList.length) {
            Object[] temp = new Object[arrayList.length * 2];
            System.arraycopy(arrayList, 0, temp, 0, size);
            arrayList = temp;
        }
        arrayList[size++] = obj;
    }
}
