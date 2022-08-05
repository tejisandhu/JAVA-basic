
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
public class bitwise_opeartors {
 public static void main(String args[]){
     int a=60;
     int  b=13;
     int c=0;
     
     c=a&b;   //AND
     System.out.println("a&b="+c);
     
     c=a|b;   //OR
     System.out.println("a|b="+c);
     
     c=a^b;  //Exclusive OR     Bitwise XOR
     System.out.println("a^b="+c);
     
     c=~a;    //NOR
     System.out.println("~a="+c);
     
     c=a<<2;   //Left Shift   IT DOUBLES BY 2 AS THERE IS 2
     System.out.println("a<<2="+c);
 
     c=a>>2;   //Right Shift  IT HALFS BY 2 AS THERE IS 2
     System.out.println("a>>2="+c);
     
     c=a>>>2;  //Zero Filled Right Shift
     System.out.println("a>>>2="+c);
 
 
 
 }   
}
