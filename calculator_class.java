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
class calc{
    int sum(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    float div(float a,float b){
        return (a/b);
    }
}

public class calculator_class {
    public static void main(String args[]){
         int x,y;
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the first value--->");
         x=sc.nextInt();
         System.out.println("Enter the second value--->");
         y=sc.nextInt();
         calc ob= new calc();
         int sum=ob.sum(x,y);
         System.out.println("The value of sum is "+sum);
         int sub=ob.sub(x,y);
         System.out.println("The value of sub is "+sub);
         int mul=ob.mul(x,y);
         System.out.println("The value of mul is "+mul);
         float div=ob.div(x,y);
         System.out.println("The value of div is "+div);

         
    }
}
