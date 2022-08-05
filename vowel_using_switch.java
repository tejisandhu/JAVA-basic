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
public class vowel_using_switch {
    public static void main(String args[]){
     
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        
        switch(ch){
            case 'a':
               // System.out.println("You entered a vowel");
            case 'e':
               // System.out.println("You entered a vowel");
            case 'i':
               // System.out.println("You entered a vowel");
            case 'o':
              //  System.out.println("You entered a vowel");      
            case 'u':
                  System.out.println("You entered a vowel");  //this approach is using fall through method
                  break;
            default:
                  System.out.println("You did not entered a vowel");      

        }
    }
}
 