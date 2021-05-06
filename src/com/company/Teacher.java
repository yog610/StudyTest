package com.company;

//自然排序！！！
//我们必须给放入集合中的数据提供排序规则
public class Teacher implements Comparable {
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

    public Teacher() {
    }

    public Teacher(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //重写equals


    @Override
    public int compareTo(Object o) {
        if (o instanceof Teacher) {
            Teacher t1 = this;
            Teacher t2 = (Teacher) o;
            if (t1.getAge() > t2.getAge()) {
                return 1;//不交换数据
            } else if (t1.getAge() < t2.getAge()) {
                return -1;//交换数据
            } else {
                return 0;//不动数据
                //从年龄大到小进行比较
            }
        }
        return 0;
    }
}
