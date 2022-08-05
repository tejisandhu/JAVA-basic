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
public class month_days_using_switch {
    public static void main(String args[]){
        String month;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the month--->");
        month=sc.next();
        
        switch(month){
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("You have entered a month with 31 days.");
                break;
             case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("You have entered a month with 30 days.");
                break;
            case "february":
                System.out.println("You have entered a month with 28 or 29 days.");
                break;
            default:
                System.out.println("You have entered INVALID month name.");
        }
    }
}
