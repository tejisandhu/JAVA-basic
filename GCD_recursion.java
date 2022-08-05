/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class gcd1 {

    int gc(int x, int y) {
        int a = x;
        if (y == 0) {
            return a;
        } else {
            x = y;
            y = a % y;
            return gc(x, y);
        }
    }
}

public class GCD_recursion {

    public static void main(String args[]) {
        gcd1 g1 = new gcd1();
        int z = g1.gc(6, 12);
        System.out.println(z);

    }
}
