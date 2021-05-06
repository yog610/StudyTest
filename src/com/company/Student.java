package com.company;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private char sex;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //重写equals

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            System.out.println("equals对象被调用");
            Student ss = (Student) o;
            if (this.getName().equals(ss.getName()) && this.getSex() == ss.getSex()) {
                return true;
            }
        }
        return false;
    }

    //重写hashcode
    @Override
    public int hashCode() {
        System.out.println("hashcode被调用");
        return sex;
    }
}
