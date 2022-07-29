/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class super1{
    int num=20;
    public void display(){
        System.out.println("This is display method of super calss and num is "+ num);
    }
}
class sub extends super1{
    int num=30;
    public void display(){
        System.out.println("This is display method of sub calss and num is "+num);
        System.out.println("Super num-->"+super.num);
    }
}
public class Super_keyword {
    public static void main(String args[]){
        sub ob= new sub();
        ob.display();
    }
}
