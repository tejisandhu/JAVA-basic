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
public class table_using_for_loop {
     public static void main(String args[]){
        int i=1,n;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number for the table--->");
        n=sc.nextInt();
        
        for(i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
     
     }}
