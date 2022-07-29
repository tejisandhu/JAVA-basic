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
public class prime_number {
    public static void main(String args[]){
        int i=2,n,flag=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number to check--->");
        n=sc.nextInt();
        
        while(i<=n-1){  // n-1 is used here because if i<=n is used it will show as a not a prime number
            if(n%i==0){  // here flag is used to know if the loop entered  the if or not
                System.out.println("It is not a prime number.");
                flag=1;
                break;  // break is used to stop the loop and exit the while
            }
            i++;
        }
        if(flag==0){
            System.out.println("The number is a prime number.");
        }
    }
}



