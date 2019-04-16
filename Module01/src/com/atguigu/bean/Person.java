package com.atguigu.bean;

import com.atguigu.java.HelloWorld;

import java.util.ArrayList;

/**
 * @author sandberg
 * @create 2019-04-16 12:28
 */
public class Person {

    private static final  HelloWorld hw = new HelloWorld();



    public void eat(){
        System.out.println("吃饭");
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("Person.main");
        System.out.println("args = " + args);
        int num=10;
        System.out.println(num);

        for (String arg : args) {
            
        }

        ArrayList list = new ArrayList();
        for (Object o : list) {
            
        }
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
