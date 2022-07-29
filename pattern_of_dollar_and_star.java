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
public class pattern_of_dollar_and_star {
    public static void main(String args[]){
        int n,i,j;
        char d='$', s='*';
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows--->");
        n=sc.nextInt();
        
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print(d+" ");
                }
                else {
                    System.out.print(s+" ");

                }
            }
            System.out.println("");

        }
        
    }
}
