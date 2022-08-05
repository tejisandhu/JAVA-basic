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
public class divisbility_of_number_by_3_and_5_using_nested_if {
    public static void main(String args[]){
         int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number--->");
        a=sc.nextInt();
        
        if(a%3==0){
            if(a%5==0){
                System.out.println("both");
            }
            else{
                                System.out.println("3");
            }
        }
        else {
             if(a%5==0){
                System.out.println("5");
            }
            else{
                                System.out.println("none");
 }
        }
        
    }
}
