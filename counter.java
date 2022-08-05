/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class counter1{
    static int count=0;  // will get memory only once and retain its value
    counter1(){
    count++;
    System.out.println(count);
}
}
public class counter {
 public static void main(String args[]){
     counter1 c1= new counter1();
     counter1 c2= new counter1();
     counter1 c3= new counter1();

 }   
}
