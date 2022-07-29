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
public class buzz_number {
 public static void main(String args[]){
     int n,d=0,lastD=0,sum=0,n1,t,sumS=0;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number to check--->");
     n=sc.nextInt();
     n1=n;
     
     
         
     if(n%7==0){  //to check if number is divisible by 7
         d=1;
     }
     
     else if(n%10==7){   //to check if the  last digit is 7
         lastD=1;
     }
    else {  // to check if the sum is equal to 7
        
         while(n>0){   // to get the sum of the digits
         t=n%10;
         sum=sum+t;
         n=n/10;}
         if(sum==7){
          sumS=1;           
         }
 }
     
     if(d==1||lastD==1||sumS==1){
         System.out.println("The number is BUZZ word");
     }
     else{
          System.out.println("The number is not BUZZ word");
        
     }
 }   
}
