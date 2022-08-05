/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
public class unary_operator {
    public static void main(String args[]){
        int a=5,b;
     //   b=a++ + ++a;  // unary operators move from right to left
     //  b=a++ + ++a + ++a;
        b=++a + a++ + ++a;
        System.out.println("b--->"+b+"\na--->"+a);
    }
}
