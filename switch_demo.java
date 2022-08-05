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
public class switch_demo {
    public static void main(String args[]){
     int a;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of day--->");
     a=sc.nextInt();
     
     switch(a){
         case 1:
             System.out.println("You selected Monday");
            // break;
         case 2:
             System.out.println("You selected Tuesday");
            // break;
         case 3:
             System.out.println("You selected Wednesday");
            // break;
         case 4:
             System.out.println("You selected Thursday");
           //  break;
         case 5:
             System.out.println("You selected Friday");
           //  break;
         case 6:
             System.out.println("You selected Saturday");
           //  break;         
         case 7:
             System.out.println("You selected Sunday");
           //  break;
         default:
             System.out.println("You selected INVALID option");
     }
    }
}
