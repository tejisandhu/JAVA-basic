/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class superclass{
int age;
superclass(int age){
this.age=age;
}
public void display(){
    System.out.println("The value of variable named age in super class is "+age);
}
}
 class subclass11 extends superclass{
    subclass11(int age){
        super(age);
    }
}
public class Super_keyword_age {
    public static void main(String args[]){
        subclass11 ob= new subclass11(24);
        ob.display();
    }
}
