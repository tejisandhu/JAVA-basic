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
public class printing_tables_using_while {
    public static void main(String args[]){
        int i=1,n,lallu;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the table");
        n=sc.nextInt();
        
        while(i<=10){
            lallu=i*n;
            System.out.println(n+" X "+i+" = "+lallu);
            i++;
        }
    }
}
