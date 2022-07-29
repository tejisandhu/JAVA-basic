/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *1+3+5+7+9
 * @author Administrator
 */
public class sum_of_first_n_odd_numbers {
    public static void main(String args[]){
        int i=1,n,sum=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number till which sum is needed--->");
        n=sc.nextInt();
         
        while(i<=2*n){
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("The sum of first "+n+" numbers is: "+sum);

       
    }
}
