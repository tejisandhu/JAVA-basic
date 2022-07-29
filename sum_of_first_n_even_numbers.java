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
public class sum_of_first_n_even_numbers {
    public static void main(String args[]){
        int i=1,n,sum=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number till which sum is needed--->");
        n=sc.nextInt();
        
        while(i<=2*n){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("The sum of first "+n+" numbers is: "+sum);
    }
}
