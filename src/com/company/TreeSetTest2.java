package com.company;

import java.util.TreeSet;

class Stu implements Comparable {
    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Stu(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Stu() {
    }
//compareTo默认是从小到大，要想从大到小---添加符号


    //学生成绩从大到小---tom例外，排在第一
    @Override
    public int compareTo(Object o) {
        if (o instanceof Stu) {
            Stu s1 = this;
            Stu s2 = (Stu) o;
            //tom          zhangsan
            if (s1.getName().equals("tom") && (!s2.getName().equals("tom"))) {
                return -1;
                //zhangsan    tom
            } else if ((!s1.getName().equals("tom")) && s2.getName().equals("tom")) {
                return 1;
            } else if (s1.getGrade() > s2.getGrade()) {
                return -1;
            } else if (s1.getGrade() < s2.getGrade()) {
                return 1;

            } else {
                return 0;

            }
        }

        return 0;

    }
}

public class TreeSetTest2 {
    /**
     * 要求学生放入集合中就已经按照成绩从大到小排序，
     * 但是遇到tom----tom一定在第一个！！！！
     */
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        Stu s1 = new Stu("san", 26);
        Stu s2 = new Stu("ton", 77);
        Stu s3 = new Stu("tom", 68);
        Stu s4 = new Stu("aaa", 96);
        Stu s5 = new Stu("bbb", 61);
        Stu s6 = new Stu("nuhao", 52);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println("/d");
        set.add(s4);
        set.add(s5);
        set.add(s6);

        System.out.println(set);


    }

}
