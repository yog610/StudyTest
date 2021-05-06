package com.company;

import java.util.Comparator;
import java.util.TreeSet;

class Doctor {
    private String name;
    private String school;
    private String id;

    public Doctor(String name, String school, String id) {
        this.name = name;
        this.school = school;
        this.id = id;
    }

    public Doctor() {
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


public class TreeSetTest3 implements Comparator {
    //客户端排序：
    //自然排序如果排序规则经常改变，就要不停修改源码
    //因此我们在构建TreeSet容器的时候，就给容器传递一个比较器---
    //那么放入其中的数据就会按照容器中的声明的排序规则进行排序
    public static void main(String[] args) {
        Comparator com1 = new TreeSetTest3();
        TreeSet set = new TreeSet<>(com1);
        Doctor d1 = new Doctor("nihao", "A", "001");
        Doctor d2 = new Doctor("ni", "C", "005");
        Doctor d3 = new Doctor("hao", "B", "006");
        Doctor d4 = new Doctor("jjj", "B", "002");
        Doctor d5 = new Doctor("bbbbbb", "B", "009");
        set.add(d1);
        set.add(d2);
        set.add(d3);
        set.add(d4);
        set.add(d5);

        System.out.println(set);

    }

    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof Doctor && o2 instanceof Doctor) {
            Doctor d1 = (Doctor) o1;
            Doctor d2 = (Doctor) o2;
            return -d1.getId().compareTo(d2.getId());
            //默认从小到大排序

            //假如想要从大到小排序：加上  负号！！
//            return  -d1.getId().compareTo(d2.getId());


        }
        return 0;
    }
}
