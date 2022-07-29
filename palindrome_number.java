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
public class palindrome_number {
    public static void main(String args[]){
         int n,s,rev=0,n1;
       Scanner sc= new Scanner (System.in);
       System.out.println("Enter the number to check palindrome--->");
       n=sc.nextInt();
       n1=n;
        while(n>0){
            s=n%10;
            rev= rev*10+s;
            n=n/10;
        }
        if(rev==n1){
              System.out.println("The number "+n1+" is palindrome");
         }
        else {
                          System.out.println("The number "+n1+" is not palindrome");
        }

    }
}
