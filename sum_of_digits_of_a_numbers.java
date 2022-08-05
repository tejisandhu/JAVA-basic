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
public class sum_of_digits_of_a_numbers {
public static void main(String args[]){
    int n, t,sum=0,loop=0,a;
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter the number--->");
    n=sc.nextInt();
    a=n;
    while(n>0){
        t=n%10;     // 1234%10=4
        sum=sum+t;
        n=n/10;     //1234/10=123 n=123 and the loop continues
        loop++;
    }
    System.out.println("The sum of digits of "+a+" is "+sum);
    System.out.println("The number digits of "+a+" is "+loop);
}    
}
