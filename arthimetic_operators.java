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
public class arthimetic_operators {
    public static void main(String args[]){
        int a1,b1,mod;
        double a,b, add,sub,div,mul;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number--->");
        a=sc.nextDouble();
        System.out.println("Enter the second number--->");
        b=sc.nextDouble();
        
        add=a+b;
        sub=a-b;
        div=a/b;
        mul=a*b;
     System.out.println("The sum of numbers is --->"+add);    
     System.out.println("The difference of numbers is --->"+sub);    
     System.out.println("The dividion of numbers is --->"+div);    
     System.out.println("The product of numbers is --->"+mul);    

    a1=(int)a;
    b1=(int)b;
       //System.out.println("Enter the first number for mmodulus--->");
      //  a1=sc.nextInt();
        // System.out.println("Enter the second number for modulus--->");
        // b1=sc.nextInt();
        mod=a1%b1;
         System.out.println("The modulus of numbers is --->"+mod);    

    }
}
