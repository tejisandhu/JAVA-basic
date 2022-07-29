/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_package;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ArrayExample2 {

    public static void main(String args[]) {
        int[] students;
        students = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of array--->");

        for (int i = 0; i < students.length; i++) {
            students[i] = sc.nextInt();
        }

        System.out.println("Array Length: " + students.length);
        System.out.println("Values of the array:");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

}
