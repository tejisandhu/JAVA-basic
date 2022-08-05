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
public class grade_of_five_subjects {
    public static void main(String args[]){
        int s1,s2,s3,s4,s5;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of English subject---->");
        s1=sc.nextInt();
        System.out.println("Enter the marks of Maths subject---->");
        s2=sc.nextInt();
        System.out.println("Enter the marks of Science subject---->");
        s3=sc.nextInt();
        System.out.println("Enter the marks of Punjabi subject---->");
        s4=sc.nextInt();
        System.out.println("Enter the marks of Geography subject---->");
        s5=sc.nextInt();
        
       float sum=s1+s2+s3+s4+s5;
        
        float percentage=(sum/500)*100;
    
    if(percentage>=90){
        System.out.println("The student have a grade A+");
    }
    if(percentage>=80&&percentage<90){
        System.out.println("The student have a grade A");
    }
    if(percentage>=70&&percentage<80){
        System.out.println("The student have a grade B+");
    }
    if(percentage>=60&&percentage<70){
        System.out.println("The student have a grade B");
    }
    if(percentage<60){
        System.out.println("The student is FAIL");
    }
    
    
    }
    
}

