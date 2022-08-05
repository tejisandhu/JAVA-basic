/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class overloading{
    void sum(int a,long b){
        System.out.println("Sum is "+(a+b));
    }
    void sum(int a, int b,int c){
        System.out.println("Sum is "+(a+b+c));
    }
}
public class class_overloading {
    public static void main(String args[]){
        overloading ob= new overloading();
        ob.sum(20, 10);
        ob.sum(11, 10, 15);
    }
}



