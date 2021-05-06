package com.company;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        //TreeSet--除了去重还可以按照指定的规则排序
        //TreeSet---除了具备去重。还可以对放入其中的数据指定排序
        //TreeSet中放置的数据类型------一般是同种数据类型。或者是可以相互转换的数据类型！！！！
        TreeSet s = new TreeSet();
        //  s.add("nin");
        s.add(1);
        s.add(66);
        s.add(12);
        s.add(100);
        s.add(1131);
        System.out.println(s);

        System.out.println("-----");
        TreeSet ss = new TreeSet();

        //往TreeSet中放置自己定义的类型
        Teacher s1 = new Teacher("ha", 18, 'v');
        Teacher s2 = new Teacher("zza", 10, 'n');
        Teacher s3 = new Teacher("zha", 21, 'v');
        Teacher s4 = new Teacher("yya", 22, 'n');
        ss.add(s1);
        ss.add(s2);
        ss.add(s3);
        ss.add(s4);

        System.out.println(ss);


    }
}
