/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class factorial2 {

    int fact(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * fact(i - 1);
        }
    }
}

public class recursion_factorial {

    public static void main(String args[]) {
        int a;
        factorial2 f1 = new factorial2();
        a = f1.fact(5);
        System.out.println(a);
    }
}
