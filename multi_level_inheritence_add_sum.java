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
class A{
    int a;
}
class B extends A{
int b;
}
class C extends B{
int c,sum;
void read(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of first number--->");
a= sc.nextInt();
System.out.println("Enter the value of second number--->");
b= sc.nextInt();
System.out.println("Enter the value of third number--->");
c= sc.nextInt();
}
void display(){
    sum=a+b+c;
    System.out.println("The sum of "+a+", "+b+", "+c+" is "+sum);

}}
public class multi_level_inheritence_add_sum {
    public static void main(String args[]){
        C c1= new C();
        c1.read();
        c1.display();
    }
}
