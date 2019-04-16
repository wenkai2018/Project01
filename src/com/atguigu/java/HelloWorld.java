package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    private String name;
    private int num;

    public static void main(String[] args) {

        System.out.println("hello world 2");
        Date date = new Date();
        ArrayList list2 = new ArrayList();
        list2.add(0, 123);
        sayout();
    }

    public static void sayout(){
       int num = 10;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
