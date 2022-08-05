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
public class circle {
    public static void main(String args[])
    {double radius;
        // area of a circle 
        Scanner sc= new Scanner(System.in);
            System.out.println("enter the Radius---->");
        radius=sc.nextDouble();
      //  double radius=5;
    double c_area= 3.14*radius*radius;
    double c_circumfrence= 2*3.14*radius;
    System.out.println("The area of the circle with radius 5 is "+c_area );
    System.out.println("The circumfrence of the circle with radius 5 is "+c_circumfrence );
     
    }
}
