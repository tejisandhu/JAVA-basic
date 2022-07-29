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
public class university_pass_fail_two_subjects {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks obtained in subject A:-->");
        a=sc.nextInt();
        System.out.println("Enter the marks obtained in subject B:-->");
        b=sc.nextInt();
        
        if(a>=55&&b>=45){
        System.out.println("The student is PASS");
         }
        else if(a>=45&&b>=55){
        System.out.println("The student is PASS");
        }
        else if(a>=65&&b<45){
        System.out.println("The student needs to REAPPEAR");
        }
        else{
        System.out.println("The student is FAIL");
        }
    }
}
