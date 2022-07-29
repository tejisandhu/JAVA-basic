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
public class reverse_number {
   public static void main(String args[]){
       int n,s,rev=0;
       Scanner sc= new Scanner (System.in);
       System.out.println("Enter the number to reverse--->");
       n=sc.nextInt();
        while(n>0){
            s=n%10;
            rev= rev*10+s;
            n=n/10;
        }
               System.out.println("Reverse of the number reversed is "+rev);

   } 
}
