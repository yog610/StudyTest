package com.company;

import java.util.LinkedList;

public class Linked1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(0, 20);
        list.addFirst(30);
        list.addLast(50);
        list.push(200);
        System.out.println(list);
        //删除
        // Object o=10;
        //list.remove(o);
        //list.remove(2);
        list.pop();//默认删除第一个
        System.out.println(list);

    }

}
