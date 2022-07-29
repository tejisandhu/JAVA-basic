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
class calculation {

    int z;

    public void addititon(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers is " + z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The sub of the given numbers is " + z);
    }

}

class myCalculation extends calculation {

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers is " + z);
    }
}

public class Inheritence_for_calculation {

    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number--->");
        a = sc.nextInt();
        System.out.println("Enter the second number--->");
        b = sc.nextInt();
        myCalculation c1 = new myCalculation();
        c1.addititon(a, b);
        c1.subtraction(a, b);
        c1.multiplication(a, b);
    }
                                                             
}
