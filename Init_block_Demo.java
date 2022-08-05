/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class Blockdemo {

    private String name;

    Blockdemo(int x) {
        System.out.println("In 1 argument constructor, name= " + this.name);
    }

    Blockdemo() {
        name = "Teji";
        System.out.println("In no argument constructor, name= " + this.name);
    }

    //first static initialization block
    static {
        System.out.println("In first static initialization block ");
    }

    //first instance initialization 
    {
        System.out.println("In  first initialization block " + this.name);
    }
    //second instance initialization 

    {
        System.out.println("In  second instance initialization block " + this.name);
    }
    //second static initialization block

    static {
        System.out.println("In second static initialization block ");
    }

}

public class Init_block_Demo {

    public static void main(String args[]) {
        new Blockdemo();
        new Blockdemo();
        new Blockdemo(7);
    }
}
