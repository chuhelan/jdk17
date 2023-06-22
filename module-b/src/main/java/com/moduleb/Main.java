package com.moduleb;

import com.modulea.User;

/**
 * @Author：chuhelan
 * @Package：com.moduleb
 * @Project：jdk17
 * @name：Main
 * @Date：6/22/2023 4:15 PM
 * @Filename：Main
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("abc",123);
        System.out.println(user);
    }
}
