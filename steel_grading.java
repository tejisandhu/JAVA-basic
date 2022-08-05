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
public class steel_grading {
    public static void main(String args[]){
        int hard, tensile;
        double carbon;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Hardness of the steel--->");
        hard=sc.nextInt();
         System.out.println("Enter the Carbon content of the steel--->");
        carbon=sc.nextDouble();
         System.out.println("Enter the Tensile Strength of the steel--->");
        tensile=sc.nextInt();
        
        if(hard>50&&carbon<0.7&&tensile>5600){
            System.out.println("The Steel is Grade 10");
        }
        else if(hard>50&&carbon<0.7&&(tensile<=5600)){
            System.out.println("The Steel is Grade 9");
        }
         else if(hard<=50&&carbon<0.7&&(tensile>5600)){
            System.out.println("The Steel is Grade 8");
        }
         else if(hard>50&&carbon>0.7&&(tensile>5600)){
            System.out.println("The Steel is Grade 7");
        }
         else if(hard>50&&carbon>0.7&&(tensile<=5600)){
            System.out.println("The Steel is Grade 6");
        }
        else if(hard<50&&carbon<0.7&&(tensile<=5600)){
            System.out.println("The Steel is Grade 6");
        }
        else if(hard>50&&carbon>0.7&&(tensile>5600)){
            System.out.println("The Steel is Grade 6");
        }
        else{
            System.out.println("The Steel is Grade 5");
        }
    }
}
