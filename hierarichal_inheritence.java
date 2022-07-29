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
class A1{
    int a;
}
class Bb extends A1{
int b;
void read(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of number--->");
a=sc.nextInt();
b=sc.nextInt();
}
void displayB(){
    System.out.println("Sum is--->"+(a+b));
}
}
class Cc extends A1{
int c;
void read(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of number--->");
a=sc.nextInt();
c=sc.nextInt();
}
void displayC(){
    System.out.println("Sum is--->"+(a+c));
}
}

public class hierarichal_inheritence {
    public static void main(String args[]){
        Bb b1= new Bb();
        Cc c1= new Cc();
        b1.read();
        b1.displayB();
        c1.read();
        c1.displayC();
    }
}
