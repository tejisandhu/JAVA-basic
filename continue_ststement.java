/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
public class continue_ststement {
    public static void main(String args[]){
        int i;
        
        for(i=1;i<=10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
