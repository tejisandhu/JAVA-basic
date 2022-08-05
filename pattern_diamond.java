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
public class pattern_diamond {
 public static void main(String args[]){
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows--->");
        n=sc.nextInt();
       
        // LOOP FOR THE FIRST HALF OF THE DIAMOND
        for(i=1;i<=n;i++){
            //LOOP FOR SPACE
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //LOOP FOR STAR
             for(k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
        // LOOP FOR THE SECOND HALF OF THE DIAMOND
         for(i=n;i>=1;i--){
            //for space
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=(2*i-1);k++){
                System.out.print("*");
                
            }
            System.out.println("");

        }
    
 }   
}
