/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class student1{
    int id;
    String name;
    
    student1(int i, String n){ //constructor has same name as the class and has no return type
        id=i;
        name=n;
    }
    
    void display(){
        System.out.println(id+" "+name);
    }
}
public class constructor_parameterized {
    public static void main(String args[]){
    student1 s1= new student1(111,"Teji");
    student1 s2= new student1(222,"Sandhu");
    s1.display();
    s2.display();
}
}