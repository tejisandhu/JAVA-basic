/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class calculate {

    static int cube(int x) {
        return x * x * x;
    }
}

public class static_cube {

    public static void main(String args[]) {
        int result = calculate.cube(5);
        System.out.println(result);
    }
}
