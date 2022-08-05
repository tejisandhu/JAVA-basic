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
public class multiple_if {
    public static void main(String args[]){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Add the first number---->");
        a=sc.nextInt();
        System.out.println("Add the second number---->");
        b=sc.nextInt();
        System.out.println("Add the third number---->");
        c=sc.nextInt();
        
        if((a>b)&&(a>c)){
                    System.out.println(a+" is the largest number");
}
 if((b>a)&&(b>c)){
                    System.out.println(b+" is the largest number");
}
 if((c>a)&&(c>b)){
                    System.out.println(c+" is the largest number");
}
        
    }
}
