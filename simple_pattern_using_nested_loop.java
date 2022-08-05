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
public class simple_pattern_using_nested_loop {
     public static void main(String args[]){
        int i=1,r,c,j;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of rows--->");
        r=sc.nextInt();
         System.out.println("Enter the number of columns--->");
        c=sc.nextInt();
     
        for(i=1;i<=r;i++){
            for(j=1;j<=c;j++){
                  System.out.print("*");
                 }
            System.out.println("");
        }
     // ***
     // ***
     
     }
}
