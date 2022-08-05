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
public class vote_eligibility {
    public static void main(String args[]){
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age to check eligibility--->");
        a=sc.nextInt();
        if(a>=18){
            System.out.println("The candidate is eligible to vote");
        }
        else{
            System.out.println("The candidate is not eligible to vote");
        }
        
    }
}
