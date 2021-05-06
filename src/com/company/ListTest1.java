package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {

    public static void main(String[] args) {
        //name-age-sex
        String str = args[0];
        String[] mess = str.split("[-]");
        int age = Integer.parseInt(mess[1]);
        char sex = mess[2].toCharArray()[0];

        Person p = new Person(mess[0], age, sex);
        List list = new ArrayList();
        list.add(p);
        System.out.println(list);
        //
        list.get(0);


    }
}
