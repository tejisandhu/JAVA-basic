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
public class vowel_check {
    public static void main(String args[]){
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character--->");
        ch=sc.next().charAt(0);        
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')){
            System.out.println("The entered character is a vowel");
        }
        else{
            System.out.println("The entered character is not a vowel");
        }
    }
}
