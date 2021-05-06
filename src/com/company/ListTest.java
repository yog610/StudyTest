package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //对象存储,增加下标。存放有序元素
        List list = new ArrayList();
        List listnew = new ArrayList();

        list.add(10);
        list.add(5);
        //list.add(1,50);
        listnew.addAll(list);
        list.addAll(1, listnew);
        System.out.println(list);
        list.set(3, 500);
        System.out.println(list);
        int j = list.indexOf(500);//查找500在集合哪个位置
        System.out.println(j);
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
        //截取子集合---还是左闭右开的方式
        List list1 = list.subList(1, 3);//1-2,因为左闭右开
        System.out.println(list1);
    }

}
