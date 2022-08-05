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
public class first_odd_numbers_using_while {
    public static void main(String args[]){
      int i=1,n;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number-->");
      n=sc.nextInt();
      while(i<=2*n){ //this will give the double the double the numbers as the input
          if(i%2!=0){
                System.out.println(i);

          }
          i++;
      }
    }
}
