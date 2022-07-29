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
public class pattern_increasing_according_to_row_using_numbers {
        public static void main(String args[]){
        int i,r,j;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of rows--->");
        r=sc.nextInt();
        
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                  System.out.print(j);
                 }
            System.out.println("");
        }
     // 1
     // 12
     // 123
     // 1234
     
     }
}
