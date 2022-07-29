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
public class largest_of_three_numbers_using_nested_if {
    public static void main(String args[]){
        
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number--->");
        a=sc.nextInt();
         System.out.println("Enter the second number--->");
        b=sc.nextInt();
         System.out.println("Enter the third number--->");
        c=sc.nextInt();
     
        
        if(a>b){
            if(a>c){
                System.out.println(a+" is the largest of three numbers");
            }
            else{
                System.out.println(c+" is the largest of three numbers");

            }
        }
        else{
            if(b>c){
                System.out.println(b+" is the largest of three numbers");

            }
            else{
            System.out.println(c+" is the largest of three numbers");

            }
        }
    }
}
