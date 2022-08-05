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
public class adding_division {
    public static void main(String args[]){
      int n;
      double i=1,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the numbers--->");
      n=sc.nextInt();
    while(i<=n){
        sum=sum+(i/(i+1));
        i++;
    }
      System.out.println("sum "+sum);
    
    }
}
