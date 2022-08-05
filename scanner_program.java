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
public class scanner_program {
    public static void main(String args[])
    {
        int n1, n2, n3;
        double n4;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        n1=sc.nextInt();
        System.out.println("enter the second number");
        n2=sc.nextInt();
        n3= n1+n2;
        
        System.out.println("sum is "+n3);
    System.out.println("enter the radius");
        n4=sc.nextDouble();
        double area= 3.14*n4*n4;
        System.out.println("the area is "+area);
    }
}
