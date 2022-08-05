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
public class if_else_statements {
    public static void main(String args[]){
        int a,b;
        Scanner sc= new Scanner(System.in);
                    System.out.println("Enter the first number");

        a=sc.nextInt();
                            System.out.println("Enter the second number");

        b=sc.nextInt();
        
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
            
        }
    }
}
