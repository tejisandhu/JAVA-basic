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
public class adding_the_square_of_numbers {
    public static void main(String args[]){
      int i=1,n,square,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the numbers--->");
      n=sc.nextInt();
    
      while(i<=n){
          square=i*i;
          sum=sum+square;
          i++;
      }
    System.out.println("The sum of square is "+ sum);
    }
    
}
