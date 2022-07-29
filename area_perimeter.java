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
public class area_perimeter {
     public static void main(String args[]){
     //area and perimeter of a rectangle
     int l=11;
     int br=22;
     int area= l*br;
     int peri=2*(l+br);
     
     
     System.out.println("Area is "+area);
     System.out.println("The perimeter is "+peri);
     
     double l1,b1, area1, perimeter1;
     Scanner sc= new Scanner(System.in);
      System.out.println("Enter the Length---->");
      l1=sc.nextDouble();
      System.out.println("Enter the Breath---->");
      b1=sc.nextDouble();
      
      area1=l1*b1;
      perimeter1=2*(l1+b1);
      System.out.println("The area of rectangle---->"+area1+" m.sq.");
      System.out.println("The perimeter of rectangle---->"+perimeter1+" "+ 'm');

      
 }
    
}
