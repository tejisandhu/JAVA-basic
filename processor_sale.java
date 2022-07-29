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
public class processor_sale {
 public static void main(String args[]){
    String str;
    int bit,order;
    double total, discount;
     Scanner sc=new  Scanner(System.in);
    System.out.println("Enter the agency : industrial :: university :: goverment");
     str=sc.next(); //Reads string before space
    System.out.println("Enter the microprocessor required by the bit:: 32 :: 16 :: 8");
     bit=sc.nextInt();
    System.out.println("Enter the amount of the order");
    order=sc.nextInt();
     
    if(bit==32){
        
            if(order<50000){
                if(str.equals("industrial")){
                    discount=0.05;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("goverment")){
                    discount=0.065;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("university")){
                    discount=0.075;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                }
            if(order>=50000&&order<=100000){
                if(str.equals("industrial")){
                    discount=0.075;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("goverment")){
                    discount=0.085;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("university")){
                    discount=0.075;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                }
            if(order>100000){
                if(str.equals("industrial")){
                    discount=0.1;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("goverment")){
                    discount=0.1;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("university")){
                    discount=0.075;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                }
    }
    else if(bit==16){
        if(order<10000){
            if(str.equals("industrial")){
                    discount=0.0;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("goverment")){
                    discount=0.0;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("university")){
                    discount=0.0;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
        }
        else if(order>=10000){
            if(str.equals("industrial")){
                    discount=0.05;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("goverment")){
                    discount=0.06;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("university")){
                    discount=0.05;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
        }
        else if(bit==8){
        
            if(str.equals("industrial")){
                    discount=0.1;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("goverment")){
                    discount=0.1;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
                else if(str.equals("university")){
                    discount=0.1;
                    total=order-(order*discount);
                    System.out.println("The total amount due is "+total);
                }
        }
    }
 }   
}
