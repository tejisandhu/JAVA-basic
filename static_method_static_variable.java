/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class Student9{
    int rollno;
    String name;
    static String college="ITS";
    
    static void change(){
        college="GNDU";
        // name="Teji;   this will be an error
    }
    Student9(int a, String n){
        rollno=a;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class static_method_static_variable {
    public static void main(String args[]){
        Student9.change();
        
        Student9 s1= new Student9(1,"Teji");
        Student9 s2= new Student9(2,"Sandhu");
        
        s1.display();
        s2.display();
    }
}
