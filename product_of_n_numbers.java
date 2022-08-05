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
public class product_of_n_numbers {
 public static void main(String args[]){
     int p=1,i=1,n;
     Scanner sc= new Scanner (System.in);
     System.out.println("Enter the numbers--->");
     n=sc.nextInt();
     
     while(i<=n){
         p=p*i;
         i++;
     }
      System.out.println("Product of numbers is "+p);

 }   
}
