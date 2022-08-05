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
public class armstrong_number {
    public static void main(String args[]){
        int n,n1,t,d=0;     //abcd=a^n+b^n+c^n+d^n
        double sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check if the number is Armstrong number--->");
        n=sc.nextInt();
        n1=n;
        while(n>0){
            n=n/10;
            d++;
                    }
        n=n1;
        while(n>0){
            t=n%10;
            sum=sum+ Math.pow(t,d);
            n=n/10;
        }
        if(sum==n1){
            System.out.println("The number "+n1+" is an Armstrong number");
        }
        else{
            System.out.println("The number "+n1+" is not an Armstrong number");

        }
        
    }
}
