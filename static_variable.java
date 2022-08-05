/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class StudentS{
    int rollno;
    String name;
    static String college="ITS";
    
    StudentS(int a, String n){
        rollno=a;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class static_variable {
    public static void main(String args[]){
        StudentS.college="GNDU";
        StudentS s1= new StudentS(12,"Teji");
        StudentS s2= new StudentS(13,"Sandhu");
        s1.display();
        s2.display();
    }
}
