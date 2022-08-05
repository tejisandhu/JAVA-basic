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
public class sum_of_n_numbers {
    public static void main(String args[]){
         int i=1,n,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of which sum is needed--->");
        n=sc.nextInt();
        
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of "+n+" numbers is "+sum);
    }
}
