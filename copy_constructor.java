/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class student12{
    int id;
    String name;
    student12 (int a, String n){
    id=a;
    name=n;
}
    student12 (student12 a){
        id=a.id;
        name=a.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

public class copy_constructor {
    public static void main(String arsg[]){
        student12 s1= new student12(1,"Teji Sandhu");
        student12 s2= new student12(s1);   // student12 a= s1;
        s1.display();
        s2.display();
    }
}
