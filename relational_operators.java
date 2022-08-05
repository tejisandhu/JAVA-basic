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
public class relational_operators {
    public static void main(String args[]){
        int a,b;
        boolean r;
        Scanner sc=new Scanner(System.in);
             System.out.println("Enter the first number--->");    
             a=sc.nextInt();
              System.out.println("Enter the second number--->");    
             b=sc.nextInt();
             r=a>b;
         System.out.println("First number is greater than second number? "+r);    
         System.out.println("First number is smaller than second number? "+(a<b));  
         System.out.println("First number is equal to second number? "+(a==b));    

            
        
        
    }
}
