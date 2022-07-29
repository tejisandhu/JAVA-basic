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
public class pattern_space_befor_stars {
     public static void main(String args[]){
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows--->");
        n=sc.nextInt();
       
        for(i=1;i<=n;i++){
            //LOOP FOR SPACE
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //LOOP FOR STAR
             for(k=1;k<=i;k++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
     //    *
     //   **
     //  ***
     // ****
}
