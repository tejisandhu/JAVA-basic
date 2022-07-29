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
public class if_divisible_by_three_or_five {
    public static void main(String args[]){
        int a,b;
        Scanner sc= new Scanner(System.in);
        
       
                 System.out.println("Enter the number--->");
           a=sc.nextInt();
          if((a%3==0)&&(a%5!=0)){
                                System.out.println("The number is divisible by 3");
          }
           if((a%3!=0)&&(a%5==0)){
                                System.out.println("The number is divisible by 5");
          }
            if((a%3==0)&&(a%5==0)){
                                System.out.println("The number is divisible by both 3 and 5");
          }           
            if((a%3!=0)&&(a%5!=0)){
                                System.out.println("The number is divisible by none");
          }
    }
}
