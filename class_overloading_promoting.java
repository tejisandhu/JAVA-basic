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
        System.out.println("a method is invoked ");
    }
    void sum(long a, int b){
        System.out.println("b metho is invoked ");
    }
}
public class class_overloading_promoting {
     public static void main(String args[]){
        overloading ob= new overloading();
       // ob.sum(20, 10); // there is ambiguity, this proagram will ot run as there will no type casting in the 
                        //input so the program will show an error.
    }
}
