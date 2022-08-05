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
public class labelled_break {
    public static void main(String args[]){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows--->");
        n=sc.nextInt();
        outer:       for(i=1;i<=10;i++){
                       for(j=1;j<=n;j++){
                           if(i+j==5){
                           break outer;
                            }
                           else{
                               System.out.println(j);

                           }
                        System.out.println(i);                    
            }
        }
        
    }
}
