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

class circle{
    int radius;
    double ar,circumf;
    
    void read(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle--->");
        radius=sc.nextInt();
    }
    void area(){
        ar=2*3.14*radius*radius;
                System.out.println("The area of the circle is "+ar);
    }
    void circumfrence(){
        circumf=2*3.14*radius;
        System.out.println("The circumfrence of the circle is "+circumf);
    }
    
}
public class circle_area_using_class {
    public static void main(String args[]){
      
        circle ob= new circle();
        
        ob.read();
        ob.area();
        ob.circumfrence();
    }
}
