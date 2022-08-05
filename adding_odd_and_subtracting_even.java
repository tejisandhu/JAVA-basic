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
public class adding_odd_and_subtracting_even {
  public static void main(String args[]){
      int i=1,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the numbers--->");
      n=sc.nextInt();
      
      while(i<=n){
          if(i%2!=0){
              sum=sum+i;
          }
          else{
              sum=sum-i;
          }
          i++;
      }
      System.out.println("The sum of odd numbers and difference of numbers is "+sum);
      
  }  
}
