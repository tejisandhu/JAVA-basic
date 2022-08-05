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
class student{
    String name;
    int rollno;
    double s1,s2,s3,s4,s5,total,perc;
    
    void read(){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the name of the students--->");
        name=sc.nextLine();
        System.out.println("Enter the Roll no of students--->");
        rollno=sc.nextInt();
        System.out.println("Enter the marks in English --->");
        s1=sc.nextDouble(); 
        System.out.println("Enter the marks in Maths --->");
        s2=sc.nextDouble();
        System.out.println("Enter the marks in Science --->");
        s3=sc.nextDouble();
        System.out.println("Enter the marks in Social Studies --->");
        s4=sc.nextDouble();
        System.out.println("Enter the marks in Punjabi --->");
        s5=sc.nextDouble();  
    }
    
    void result(){
        total=s1+s2+s3+s4+s5;
        perc=(total/500)*100;
        System.out.println("The percentage in five subjects is "+perc);
    }
    
    void grade(){
        if(perc>90){
            System.out.println(name+" obtained GRADE A+");
        }
        else if(perc<=90 && perc>80){
            System.out.println(name+" obtained GRADE A");
        }
         else if(perc<=80 && perc>70){
            System.out.println(name+" obtained GRADE B+");
        }
         else if(perc<=70 && perc>60){
            System.out.println(name+" obtained GRADE B");
        }
         else if(perc<=60 && perc>50){
            System.out.println(name+" obtained GRADE C+");
        }
         else if(perc<=50 && perc>40){
            System.out.println(name+" obtained GRADE C");
        }
         else if(perc<=40 && perc>33){
            System.out.println(name+" obtained GRADE D");
        }
         else{
            System.out.println(name+" obtained GRADE F");
         }        
}
}
public class students_using_class {
    public static void main(String args[]){
        student ob= new student();
        ob.read();
        ob.result();
        ob.grade();
    }
}


