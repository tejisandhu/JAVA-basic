/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class fibonacci1 {

    int fib(int i) {
        if (i == 1) {
            return 0;
        } else if (i == 2) {
            return 1;
        } else {
            return fib(i - 2) + fib(i - 1);
        }

    }
}

public class fiblonacci_recursion {

    public static void main(String args[]) {
        fibonacci1 f1 = new fibonacci1();
        int a = f1.fib(5);
        System.out.println(a);
    }
}
