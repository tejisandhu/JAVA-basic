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
public class pattern_inverted_pyramid_stars {
    public static void main(String args[]){
        int i,j,k,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows--->");
        n=sc.nextInt();
        
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
