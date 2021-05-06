package com.company;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    //去重
    //hash算法：先比较hashcode值，如果hashcode不同则一定不是同一个对象，
    //如果hashcode相同，则去比较equals方法

    /**
     * 要求名字+性别就是同一个学生,不可以重复添加
     */
    public static void main(String[] args) {
        Set set = new HashSet<>();
        Student s1 = new Student("ha", 20, 'n');
        Student s2 = new Student("a", 10, 'n');
        Student s3 = new Student("ha", 20, 'n');
        Student s4 = new Student("a", 20, 'n');
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set.size());
        System.out.println("------");
        System.out.println(set);


    }

}
