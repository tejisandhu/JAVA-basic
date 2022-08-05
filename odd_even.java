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
public class odd_even {
    public static void main(String args[]){
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number--->");
        a=sc.nextInt();
        
        b=a%2;
        
        if(b==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    
    
    }
}
