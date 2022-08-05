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

class factorial{
    int fact(int x){
        int facto=1;
        for(int i=1;i<=x;i++){
            facto=facto*i;
        }
        
        return facto;
    }
}
public class factorial_class {
    public static void main(String args[]){
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for the factorial--->");
        a=sc.nextInt();
        factorial ob=new factorial();
        b=ob.fact(a);
        System.out.println("The factorial of "+a+" is "+b);
    }
}
