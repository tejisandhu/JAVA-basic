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
public class logical_operators {
    public static void main(String args[]){
        int a,b,c;
         Scanner sc=new Scanner(System.in);
                       System.out.println("Enter the three numbers--->");    
                       a=sc.nextInt();
                       b=sc.nextInt();
                       c=sc.nextInt();
         System.out.println("This is (a<b||a<c)  OR Logical Operator--->"+(a<b||a<c));    
         System.out.println("This is (a<b&&a<c)  AND Logical Operator--->"+(a<b&&a<c));    
         System.out.println("This is (!(a<c))  NOT Logical Operator--->"+(!(a<c)));    

        
        
    }
}
