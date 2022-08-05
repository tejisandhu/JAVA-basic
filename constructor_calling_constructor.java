/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Administrator
 */
class sphere {

    int radius;
    int xradius, yradius, zradius;

    sphere() {
        radius = 0;
    }

    sphere(int x, int y, int z) {
        xradius = x;
        yradius = y;
        zradius = z;
    }

    sphere(int x, int y, int z, int r) {
        this(x, y, z);   // this will call the sphere constructor with three arguments
        radius = r;
    }
}

public class constructor_calling_constructor {

    public static void main(String args[]) {
        sphere s1 = new sphere(2, 4, 5, 3);
    }
}
