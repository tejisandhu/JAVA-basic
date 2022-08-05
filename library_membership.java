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
public class library_membership {
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days by which the member is late--->");
        a=sc.nextInt();
        
        if(a<=5){
            System.out.println("The member is due to pay 50p fine");
        }
        else if(a<=10){
            System.out.println("The member is due to pay 1 ruppee fine");            
        }
        else if(a<=30){
            System.out.println("The member is due to pay 5 ruppee fine");
        }
        else{
            System.out.println("The member is lateto return the book\nhence the membership is cancelled");

        }
    
    
    }
}
