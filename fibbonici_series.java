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
public class fibbonici_series {
    public static void main(String args[]){
        int i=1,n,f=0,s=1,sum=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number for the fibonacci series--->");
        n=sc.nextInt();
        
        while(i<=n){
            if(i==1){
                System.out.println(f);
            }
            else if(i==2){
                System.out.println(s);
                }
            else{
                sum=f+s;
                System.out.println(sum);
                f=s;
                s=sum;
                }
            i++;
        }
    }
}
