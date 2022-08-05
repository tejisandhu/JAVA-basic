/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */

class students11{
    int id, age;
    String name;
    
    students11(int i, String n){
        id=i;
        name=n;
    }
    students11(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
                System.out.println(id+" "+ name+" "+age);

    }
}
public class constructor_overloading {
    public static void main(String args[]){
        students11 s1= new students11(11,"Teji");
        students11 s2= new students11(11,"Teji",20);
            
        s1.display();
        s2.display();
    }
}
