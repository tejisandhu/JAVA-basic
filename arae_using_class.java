/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
class rectangle{
    int length,breath,ar,peri;
    
    void read(){
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Enter the length of the rectangle--->");
        length=sc.nextInt();
        System.out.println("Enter the breath of the rectangle--->");
        breath=sc.nextInt();
    }
    void area(){
        ar=length*breath;
        System.out.println("The area of the rectangle is "+ar+" sq.meter"); 
    }
    void perimeter(){
        peri=2*(length+breath);
        System.out.println("The perimeter of the rectangle is "+ peri+" meter");

    }
}


public class arae_using_class {
   public static void main(String args[]){
        
       rectangle ob=new rectangle();
       ob.read();
       ob.area();
       ob.perimeter();
   } 
}
