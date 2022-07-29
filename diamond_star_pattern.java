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
public class diamond_star_pattern {
    public static void main(String args[]){
        int rows,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows--->");
        rows=sc.nextInt();
        
      for ( i=1; i<= rows ; i++) {
          
          for ( j = rows; j > i ; j--) {
            System.out.print(" ");
        }
        System.out.print("*");
        for ( k = 1; k < 2*(i -1) ;k++) {
            System.out.print(" "); } 
        if( i==1) { System.out.println(""); } 
        else { System.out.println("*"); } } 
      
          
      for ( i=rows-1; i>= 1 ; i--)
        {
        for ( j = rows; j > i ; j--) {
            System.out.print(" ");
        }
        System.out.print("*");
        for ( k = 1; k < 2*(i -1) ;k++) {
            System.out.print(" ");
        }
        if( i==1)
            System.out.println("");
        else
            System.out.println("*");
    }
      
      
  
    }
    }
