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
public class conditional_operators {
    public static void main(String args[]){
        
        int a,b,c,d;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers--->");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=a>b?  a>c?a:c :b>c?b:c;
        System.out.println("The greater number between "+a+", "+b+" and "+c+" is "+d);
        
    }
}
 